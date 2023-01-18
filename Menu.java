package afpaJava_230118_projet_StockRoues;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	static String listeMenu[] = {
			"1: Entrer une roue",
			"2: Monter une roue",
			"3: Afficher liste des roues",
			"4: Entrer une voiture",
			"5: Afficher liste des voitures",
			"6: Afficher caractéristiques d'une voiture",
			"7: Quitter"
	};
	
	static Scanner scan = new Scanner(System.in);
	
	static void afficherMenu(String message) {
		cls();
		System.out.println(message);
		System.out.println("--- Menu ---");
		for (String e: listeMenu) {
			System.out.println(e);
		}
		int choixMenu = scan.nextInt();		
		switch (choixMenu) {
		case 1: 
			menu1();
			break;
		case 2: 
			menu2();
			break;
		case 3: 
			menu3();
			break;
		case 4: 
			menu4();
			break;
		case 5: 
			menu5();
			break;
		case 6: 
			menu6();
			break;
		case 7: 
			menu7();
			break;
		}
	}
	
	
	static void cls() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}

	
	// menu entrer une roue
	static void menu1() {
		cls();
		System.out.println("Entrer n° roue :");
		int num = scan.nextInt();
		System.out.println("Entrer diamètre :");
		double diametre = scan.nextDouble();
//		Roue.listeRoues.add(new Roue(num, diametre));
		new Roue(num, diametre);
		afficherMenu("Roue n°" + num + "\t diamètre: " + diametre + "\tinsérée.");
	}
	
	// menu monter une roue
	static void menu2() {
		cls();
		Roue.afficherListeRoues();
		Voiture.afficherListeVoitures();
		System.out.println("Monter la roue n° :");
		int numRoue = scan.nextInt();
		System.out.println("Sur la voiture n° :");
		int numVoiture = scan.nextInt();
		
		// gestion cas où la voiture possède déjà 4 roues :
		Voiture v = Voiture.getVoiture(numVoiture);
		if (v.nbRouesMontees() == 4) {
			System.out.println("La voiture n°" + numVoiture + " possède déjà 4 roues :");
			v.afficherRouesMontees();
			System.out.println("(Retour : Enter)");
			Scanner s = new Scanner(System.in);
			s.nextLine();
			cls();
			afficherMenu("");
		} else {
			v.ajoutRoue(Roue.getRoue(numRoue));
			cls();
			afficherMenu("Roue n°" + numRoue + " montée sur la voiture n°" + numVoiture);
		}
		
	}
	

	// menu afficher liste roues
	static void menu3() {
		cls();
		Roue.afficherListeRoues();
		System.out.println("(Retour : Enter)");
		Scanner s = new Scanner(System.in);
        s.nextLine();
		afficherMenu("");
	}
	
	// menu entrer une voiture
	static void menu4() {
		cls();
		System.out.println("Entrer n° voiture :");
		int num = scan.nextInt();
		System.out.println("Entrer couleur :");
		String couleur = scan.next();
//		Roue.listeRoues.add(new Roue(num, diametre));
		new Voiture(num, couleur);
		afficherMenu("Voiture n°" + num + "\t couleur: " + couleur + "\tinsérée.");
	}
	
	// menu afficher liste voitures
	static void menu5() {
		cls();
		Voiture.afficherListeVoitures();
		System.out.println("(Retour : Enter)");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		afficherMenu("");
	}

	// menu afficher caractéristiques voiture
	static void menu6() {
		cls();
		Voiture.afficherListeVoitures();
		System.out.println("Entrer n° voiture :");
		int numVoiture = scan.nextInt();
		Voiture v = Voiture.getVoiture(numVoiture);
		System.out.println("Voiture n° : " + v.getNum() + "\tCouleur : " + v.getCouleur());
		System.out.println("Nb de roues montées : " + v.nbRouesMontees());
		for (Roue r: v.listeRouesMontees) {
			System.out.println("Roue n°" + r.getNum() + "\t diamètre: " + r.getDiametre());
		}
		System.out.println("(Retour : Enter)");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		afficherMenu("");
	}
	
	static void menu7() {
		cls();
		System.out.println("Au revoir.");
		System.exit(0);
	}
	
	
	
}
