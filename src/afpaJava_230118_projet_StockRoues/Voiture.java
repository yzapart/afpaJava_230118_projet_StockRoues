package afpaJava_230118_projet_StockRoues;

import java.util.ArrayList;

public class Voiture {
	private int num;
	private String couleur;

	// inventaire des voitures
	public static ArrayList<Voiture> listeVoitures = new ArrayList<Voiture>();

	public static void afficherListeVoitures() {
			System.out.println("--- Voitures : ---");
			for (Voiture v: listeVoitures) {
				System.out.println("Voiture n° : " + v.getNum() + "\tCouleur : " + v.getCouleur());
			}
		}

	// création tableau dynamique de type entier
	public ArrayList<Roue> listeRouesMontees = new ArrayList<Roue>();

	public Voiture(int num, String couleur) {
		this.num = num;
		this.couleur = couleur;
		listeVoitures.add(this);
	}

	public int getNum() {
		return num;
	}

	public String getCouleur() {
		return couleur;
	}
	
	public static Voiture getVoiture (int num) {
		for (Voiture v: listeVoitures) {
			if (v.getNum() == num) {
				return v;
			}
		}
		return null;
	}

	public void ajoutRoue(Roue r) {
		r.setEtat(false);
		listeRouesMontees.add(r);
	}

	public ArrayList<Roue> getRoues() {
		return listeRouesMontees;
	}

	public void afficherRouesMontees() {
		System.out.println("Roues installées sur la voiture n°" + this.num + " (couleur " + this.couleur + ") :");
		for (Roue r : listeRouesMontees) {
			System.out.println("Roue num: " + r.getNum() + "\tDiamètre: " + r.getDiametre() + "\tEtat: " + r.getEtat());
		}
	}
	
	public int nbRouesMontees() {
		return this.listeRouesMontees.size();
	}

}

