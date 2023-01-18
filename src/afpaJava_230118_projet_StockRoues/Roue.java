package afpaJava_230118_projet_StockRoues;

import java.util.ArrayList;

public class Roue {

	private int num;
	private boolean etat = true;
	private double diametre;

	// inventaire des roues fabriquées
	public static ArrayList<Roue> listeRoues = new ArrayList<Roue>();

	public static void afficherListeRoues() {
		System.out.println("--- Roues fabriquées : ---");
		for (Roue r : listeRoues) {
			System.out.println("Roue num: " + r.getNum() + "\tDiamètre: " + r.getDiametre() + "\tEtat: " + r.getEtat());
		}
	}

	public Roue(int num, double diametre) {
		this.diametre = diametre;
		this.num = num;
		this.etat = true; // true : stockée en entrepot, false : sur une voiture

		// on ajoute la roue dans l'arrayList listeRoues :
		listeRoues.add(this);
	}

	public static Roue getRoue(int num) {
		for (Roue r: listeRoues) {
			if (r.getNum() == num) {
				return r;
			}
		}
		return null;
	}
	
	public int getNum() {
		return num;
	}

	public boolean getEtat() {
		return etat;
	}

	public double getDiametre() {
		return diametre;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	public void afficherRoue() {
		System.out.println("Roue n°" + this.getNum() + "\t diamètre : " + this.getDiametre() + "\tEtat : " + this.getEtat());
	}

}
