package produit;

public abstract class Produit {
public enum Unite{LITRE,GRAMME,KILOGRAMME,CENTILITRE,MILLILITRE,PIECE}
private String name;
private Unite unite;

public Produit(String name, Unite unite) {
	this.name = name;
	this.unite = unite;
}

public String getName() {
	return name;
}

public abstract String decrireProduit();

}
