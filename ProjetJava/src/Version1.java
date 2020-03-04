import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Version1 {
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int reponse = 1;
		
		double prix =0.0;
		
		String filmA = "les miserables";
		
		int numero = 1;
		
		int[] placek = {0,0,0};
		
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String date1 = format.format(date);
		
		//definition des class
		Class film = new Class(); 
		
		BDD steak = new BDD();
		
		while(reponse == 1 && reponse != 2)
		{
			
		System.out.println("Veuillez saisir un nombre de personnes :");
		
		int Nbm = sc.nextInt();

		//fonction choix prix 
		
		prix = film.Tarif(Nbm);

		
		//fonction choix film 
		filmA = film.Film(Nbm);

		 
		//fonction affichage du prix
		film.Affichage1(prix);
		
		//fonction ajout dans la BDD
		//steak.ajout(numero,Nbm,filmA,date1);
		
		//on reset les valeurs
		reponse = 2;
		
		
		//pour recommencer ou non 
		while(reponse != 1 && reponse == 2)
		  {
		    System.out.println("Voulez-vous réessayer ? (1/0)");
		    reponse = sc.nextInt();
		  }
		
		}
		film.Affichage2(placek);
	}
	
}
