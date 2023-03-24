package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
private int poid;
private Gaulois chasseur;

	public Sanglier(int poid,Gaulois chasseur) {
		super("Sanglier", Unite.PIECE);
		this.poid = poid;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return ""+super.getName()+" de "+this.poid+" kg chasé par ce salop de "+this.chasseur.getNom();
		}

}
