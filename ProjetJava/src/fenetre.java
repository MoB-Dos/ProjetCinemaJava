
import java.awt.*;  
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class fenetre extends JFrame {
	
	//creation des panel
	JPanel panel = new JPanel();
    JPanel bilanPanel = new JPanel();
    
    //creation du tableau pour l'affichage
    Object[][] data ;
    
    //on instancie de la BDD
    BDD MaBDD = new BDD();
    
    //creation des TextField
	private JFormattedTextField Pfield = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField Afield = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField Efield = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField Nfield = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField PTfield = new JFormattedTextField(NumberFormat.getIntegerInstance());
	
	//creation des boutons
    JButton submit = new JButton("Valider !");
    JButton bilan = new JButton("Voir le Bilan");
	JButton retour = new JButton("Retour");
				
	
	//creation de la Liste deroulante
	private String choix[] = {" Annihilation", "Drive", "Les Miserables"};    
	private JComboBox film = new JComboBox(choix);
	
	//on recupere la Date pour l'insertion
	DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	String date1 = format.format(date);
	
     
	
  public fenetre(){
	  				
	  			//on set notre fenetre
			    this.setTitle("Reservation Place ");
			    this.setSize(600, 350);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   
				//on set nos panel
			    this.panel.setLayout(null);
			    this.bilanPanel.setLayout(null);
			 		        
			        
			//on definis la position et on ajoute les JTEXTFIELD
			Pfield.setBounds(205, 70, 40, 20);
			 			panel.add(Pfield);
			 			
			Efield.setBounds(127, 100, 40, 20);
			 			panel.add(Efield);
			 			
			Afield.setBounds(126, 120, 40, 20);
			 			panel.add(Afield);

			 			
			Nfield.setBounds(110, 140, 40, 20);
			 			panel.add(Nfield);
			 			
			PTfield.setBounds(130, 160, 40, 20);
			 			panel.add(PTfield);
			
			//on definis la position et on ajoute la Liste Deroulante
			film.setBounds(155, 190,100, 20);
						  panel.add(film);
			 			
			 //on definie et on ajoute les JLABEL	
			 JLabel lb_text = new JLabel();
				    lb_text.setFont(new Font("Verdana", 1, 12));
				    lb_text.setForeground(new Color(0, 0, 0));
				    lb_text.setText("Choissisez le prix, les places et le film !");
				    lb_text.setBounds(140, 10,500, 20);
				    panel.add(lb_text);
				        
			 JLabel personneTxt = new JLabel();
				    personneTxt.setFont(new Font("Verdana", 1, 12));
				    personneTxt.setForeground(new Color(0, 0, 0));
				    personneTxt.setText("Nombre de Personne :");
				    personneTxt.setBounds(50, 70,500, 20);
			        panel.add(personneTxt);
			        
			 JLabel prixETxt = new JLabel();
				    prixETxt.setFont(new Font("Verdana", 1, 12));
				    prixETxt.setForeground(new Color(0, 0, 0));
				    prixETxt.setText("Etudiants :");
				    prixETxt.setBounds(50, 100,500, 20);
			        panel.add(prixETxt);
			            
			 JLabel prixATxt = new JLabel();
				    prixATxt.setFont(new Font("Verdana", 1, 12));
				    prixATxt.setForeground(new Color(0, 0, 0));
				    prixATxt.setText("(-10) ans :");
				    prixATxt.setBounds(50, 120,500, 20);
			        panel.add(prixATxt);
			             
			 JLabel prixNTxt = new JLabel();
				    prixNTxt.setFont(new Font("Verdana", 1, 12));
				    prixNTxt.setForeground(new Color(0, 0, 0));
				    prixNTxt.setText("Navigo :");
				    prixNTxt.setBounds(50, 140,500, 20);
			        panel.add(prixNTxt);
			       
			 JLabel prixPTxt = new JLabel();
				    prixPTxt.setFont(new Font("Verdana", 1, 12));
				    prixPTxt.setForeground(new Color(0, 0, 0));
				    prixPTxt.setText("Plein tarif :");
				    prixPTxt.setBounds(50, 160,500, 20);
			        panel.add(prixPTxt);
			            
		     JLabel filmTxt = new JLabel();
				    filmTxt.setFont(new Font("Verdana", 1, 12));
				 	filmTxt.setForeground(new Color(0, 0, 0));
				 	filmTxt.setText("choix du film :");
				 	filmTxt.setBounds(50, 190,500, 20);
				    panel.add(filmTxt);
				            
						
			//on definis les boutons
		     submit.setBounds(210, 240,100, 20);
		     submit.addActionListener(new BoutonListener());
			 panel.add(submit);
				
			 bilan.setBounds(20, 270,120, 20);
			 bilan.addActionListener(new BilanListener());
			 panel.add(bilan);
				
			 retour.setBounds(20, 20,90, 20);
		     retour.addActionListener(new RetourListener());
			 bilanPanel.add(retour);
				
			//j'appelle ma methode Select	
			data = MaBDD.select();
				  
			
			//Les titres des colonnes
			String  title[] = {"numero", "nombre", "Etud","Dix","Navigo","PleinTarif","film","date"};
		    JTable tableau = new JTable(data, title);

		    //Nous ajoutons notre tableau à notre contentPane dans un scroll
		    //Sinon les titres des colonnes ne s'afficheront pas !
		    tableau.setBounds(20, 20,90, 20);
			bilanPanel.add(tableau);
			    this.add(tableau);
			    this.getContentPane().add(new JScrollPane(tableau));
			    //bilanPanel.add(tableau);
				
			    
			    
				//on affiche le Panel
			    this.setContentPane(panel); 
			    this.setVisible(true);   
  }
  

 public void fenetre2(){
	 
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("JTable");
	    this.setSize(700, 220);
	    
	    data = MaBDD.select();
	  

	    //Les titres des colonnes
	    String  title[] = {"numero", "nombre", "Etud","Dix","Navigo","PleinTarif","film","date"};
	    JTable tableau = new JTable(data, title);
	    //Nous ajoutons notre tableau à notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	    bilanPanel.add(tableau);
	    this.getContentPane().add(new JScrollPane(tableau));
	    this.setVisible(true); 
	 
 }
 
//on change le panel en "bilanPanel"
  public void changerMenu2(){
	  
	  
	  this.setVisible(false); 
	  fenetre2.setVisible(true);
	  //this.setContentPane(this.bilanPanel);
      //this.revalidate();;
      
      }
  
  
  //on change le panel en "panel"
  public void changerMenu1(){
	  
	  //this.setContentPane(this.panel);
      //this.revalidate();;
      
  	  }
  
 //ActionListener du bouton "Valider"
 class BoutonListener implements ActionListener{
					 
public void actionPerformed(ActionEvent e) {
					    	
	//on verifie bien que le nombre de place donnee est egal au nombre de personne
	int res = Integer.valueOf(Efield.getText()) + Integer.valueOf(Afield.getText()) + Integer.valueOf(Nfield.getText()) + Integer.valueOf(PTfield.getText());
					    	
	if(res == Integer.valueOf(Pfield.getText())) 
	{
	//on prepare les variables pour l'insertion
	System.out.println(res);
	System.out.println("TEXT :" + film.getSelectedItem());
	System.out.println("TEXT :" + Pfield.getText());
	System.out.println("TEXT :" + Efield.getText());
	System.out.println("TEXT :" + Afield.getText());
	System.out.println("TEXT :" + Nfield.getText());
	System.out.println("TEXT :" + PTfield.getText());
					    	
	String Nbm = Pfield.getText();
	String Etud = Efield.getText();
	String Dix = Afield.getText();
	String Navigo = Nfield.getText();
	String PleinTarif = PTfield.getText();
	String filmA = (String) film.getSelectedItem();
					  
	//on insert avec nos variables 
	MaBDD.ajout(Nbm,Etud,Dix,Navigo,PleinTarif,filmA,date1);
	
	}
	else {System.out.println("erreur");}
					    		
	}
 }

 //methode pour changer de panel
class BilanListener implements ActionListener{
						 
public void actionPerformed(ActionEvent e) {
					    	
fenetre.this.changerMenu2();
					    	
 }
					    	
}
	
//methode pour changer de panel
class RetourListener implements ActionListener{
						 
public void actionPerformed(ActionEvent e) {
					    	
fenetre.this.changerMenu1();
					    	
  }

}
		  
}


