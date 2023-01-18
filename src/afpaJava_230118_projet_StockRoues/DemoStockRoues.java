package afpaJava_230118_projet_StockRoues;
// gérer plusieurs voitures
// avec un menu complet



public class DemoStockRoues {

	public static void main(String[] args) {
		
		new Roue(1234, 15.2);
		new Roue(1235, 15.2);
		new Roue(1236, 15.2);
		new Roue(1237, 15.2);
		new Roue(1238, 15.2);
		new Roue(1239, 12);
		new Roue(1240, 12);
		new Roue(1241, 12);
		new Roue(1242, 12);

		new Voiture(6001, "Rouge");
		new Voiture(6002, "Bleue");
		new Voiture(6003, "Rose");
		
		Voiture.getVoiture(6001).ajoutRoue(Roue.getRoue(1234));
		Voiture.getVoiture(6001).ajoutRoue(Roue.getRoue(1235));
		Voiture.getVoiture(6001).ajoutRoue(Roue.getRoue(1236));
		
		
		Menu.afficherMenu("");
		
		
		//		Roue r1 = new Roue(1234, 15.2);
//		Roue r2 = new Roue(1235, 15.2);
//		Roue r3 = new Roue(1236, 15.2);
//		Roue r4 = new Roue(1237, 15.2);
//		Roue r5 = new Roue(1238, 15.2);
//		Roue r6 = new Roue(1239, 12);

//		
//		
//		Voiture v1 = new Voiture(6001, "Rouge");
//		
//		v1.ajoutRoue(r1);
//		v1.ajoutRoue(r2);
//		v1.ajoutRoue(r3);
//		v1.ajoutRoue(r4);
//		
//		System.out.println("--- Etats : ---");
//		System.out.println("Roue num: " + r1.getNum() + "\t-> " + r1.getEtat());
//		System.out.println("Roue num: " + r2.getNum() + "\t-> " + r2.getEtat());
//		System.out.println("Roue num: " + r3.getNum() + "\t-> " + r3.getEtat());
//		System.out.println("Roue num: " + r4.getNum() + "\t-> " + r4.getEtat());
//		System.out.println("Roue num: " + r5.getNum() + "\t-> " + r5.getEtat());
//	
//		System.out.println("---");
//		
//		v1.afficherRouesMontees();
//		
//		System.out.println("---");
//		Roue.afficherListeRoues();
		
	}
	
	
	
}
