import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class expe extends JFrame {
	
	//CTRL + SHIFT + O pour générer les imports
	BDDtest frite = new BDDtest();
	Object[][] data ;
	JPanel bilanPanel = new JPanel();
	
	  public expe(){
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("JTable");
	    this.setSize(700, 220);
	    
	    data = frite.select();
	  

	    //Les titres des colonnes
	    String  title[] = {"numero", "nombre", "Etud","Dix","Navigo","PleinTarif","film","date"};
	    JTable tableau = new JTable(data, title);
	    //Nous ajoutons notre tableau à notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	    bilanPanel.add(tableau);
	    this.getContentPane().add(new JScrollPane(tableau));
	    
	  }   
	  
public static void main(String[] args){
	    expe fen = new expe();
	    fen.setVisible(true);
	  }
}