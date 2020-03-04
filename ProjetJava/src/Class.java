import java.util.Scanner;

public class Class {
	
	Scanner sc = new Scanner(System.in);
	 
	private int place0 = 0, place1 = 0, place2 = 0;
	
	private double prix = 0.0;
	
	private int reponse = 1, choix = 0;
	
	private int Nbm = 0;
	
	private String filmA;
	
	
	public double Tarif(int Nbm) 
	{
		
		for(int i = 0; i != Nbm; i++) 
		{
			System.out.println("Veuillez choisir un Tarif :");
			System.out.println(" ");
			System.out.println("-Étudiants     (7,50€)      (1)");
			System.out.println("-(- 10) ans    (5€)         (2)");
			System.out.println("-Navigo        (8€)         (3)");
			System.out.println("-Plein tarif   (11€)        (4)");
			
			int tarif = sc.nextInt();
			
		if(tarif == 1) {prix = prix + 7.50;}
		
		if(tarif == 2) {prix = prix + 5 ;}
		
		if(tarif == 3) {prix = prix + 8 ;}
		
		if(tarif == 4) {prix = prix + 11 ;}

		}	
		
		return prix;
	}
	
	public String Film(int Nbm) {
		
		while(choix == 0) {
			
			System.out.println("Veuillez choisir un Film : (1/2/3)");
			System.out.println("Film 1 : Les Misérables");
			System.out.println("Film 2 : Annihilation");
			System.out.println("Film 3 : Drive");
			
			int film = sc.nextInt();
			System.out.println(" ");

			
			if(film == 1) {
				if(place0<5) { place0 = place0 + Nbm ; 
							  choix = 1;
							  filmA = "Les Miserables";
				}else {System.out.println("film complet");}
			}
			
			if(film == 2) {
				if(place1 <100) { place1 = place1 + Nbm ;
								  choix = 1;
								  filmA = "Annihilation";
				}else {System.out.println("film complet");}
			}
			
			if(film == 3) {
				if(place2 <100) { place2 = place2 + Nbm ; 
								  choix = 1;
								  filmA = "Drive";
				}else {System.out.println("film complet");}
			}
			
		}
		
		choix = 0;
		
		//int [] placek = {place0, place1, place2};
		
		return  filmA;

	}
	
	public void Affichage2(int[] placek)
	{
		System.out.println("le nombre de place occupe pour le film 1: " + placek[0]);
		System.out.println("le nombre de place occupe pour le film 2: " + placek[1]);
		System.out.println("le nombre de place occupe pour le film 3: " + placek[2]);
		System.out.println(" ");
	}
	
	public void Affichage1(double prix)
	{
	
		System.out.println(" ");
		System.out.println("le total a payer :" + prix);
		System.out.println(" ");
	
	
	}

}

