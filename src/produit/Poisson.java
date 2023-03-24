package produit;

public class Poisson extends Produit implements IProduit{
private String datePeche;
	public Poisson( String datePeche) {
		super("Poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}
	@Override
	public String decrireProduit() {
		
		return ""+super.getName()+" p�ch� "+this.datePeche;
	}

}
