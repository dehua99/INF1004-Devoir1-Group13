package Devoir1;

public class Chauffeur {  
	private String nom,prenom,adr;
	private int ann;
	private TrajetList Tre;
	
	public Chauffeur(String nom, String prenom, int ann, String adr, TrajetList Tra) {
	this.nom= nom;
	this.prenom= prenom;
	this.ann= ann;
	this.adr= adr;
	this.Tre= Tre;
}
	public String toString() {
	    return nom+ " "+ prenom + ann+ " employ¨¦"+ " "+ adr+ "\n les trajets:" + Tre;
	}
	


	
}
