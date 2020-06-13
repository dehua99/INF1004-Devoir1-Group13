package Devoir1;

public class Chauffeur {  
	private String nom,prenom,adr;
	private int ann;
	private Trajet Tre;
	
	public Chauffeur(String nom, String prenom, int ann, String adr, Trajet Tra) {
	this.nom= nom;
	this.prenom= prenom;
	this.ann= ann;
	this.adr= adr;
	this.Tre= Tre;
}
	
	
	private class Trajet{
		private String villeD,villeA;
		private int kilometrageD,kilometrageA;
		private String limousine;
		public Trajet(String villeD,String villeA,int kilometrageD,int kilometrageA,String limousine) {
			this.villeD= villeD;
			this.villeA= villeA;
			this.kilometrageD= kilometrageD;
			this.kilometrageA= kilometrageA;
			this.limousine= limousine;
		}
	}
}
