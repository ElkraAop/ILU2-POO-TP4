package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal {
private Gaulois vendeur;
private P[] tabProduit;
private int qtProd;
private double prix;

public void installerVendeur(Gaulois vendeur,P[] produit, double prix) {
	this.tabProduit = produit;
	this.vendeur = vendeur;
	this.prix = prix;
}
@Override
public Gaulois getVendeur() {
	// TODO Auto-generated method stub
	return vendeur;
}
@Override
public double donnerPrix() {
	// TODO Auto-generated method stub
	return prix;
}
@Override
public int contientProduit(String produit, int quantiteSouhaitee) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public double acheterProduit(int quantiteSouhaitee) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public String etatEtal() {
	// TODO Auto-generated method stub
	return null;
}
}
