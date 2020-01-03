package fr.gtm.monopoly;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public Joueur(String nom, Pion pion) {
		this.nom = nom;
		this.pion = pion;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void jouer(Gobelet gobelet) {
		gobelet.lancer();
		int r = gobelet.getValeur();
		pion.avancer(r);
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}
	
	
}
