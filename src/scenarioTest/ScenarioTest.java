package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		/* Test 1 //
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;*/
		/* Test 2 //
		IEtal<Sanglier>[] marche = new IEtal[3];
		IEtal<Sanglier>[] etalSanglier = new IEtal[3];
		IEtal<Poisson>[] etalPoisson = new IEtal[3];
		etalSanglier[0] = new Etal<Sanglier>();
		marche[0] = etalSanglier[0];
		marche[1] = etalPoisson[0];
		// Test 3 */
		//Etal[] etals = new IEtal[3];
		//Etal<Sanglier> etalSanglier = new Etal<>();
		//etals[0] = etalSanglier;
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		Etal s1 = new Etal<Sanglier>();
		Etal s2 = new Etal<Sanglier>();
		Etal p1 = new Etal<Poisson>();
		Etal[] marche = {s1,s2,p1};
		marche[0].installerVendeur(obelix, sangliersObelix, 8);
		marche[1].installerVendeur(asterix, sangliersAsterix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);
	}
	
}
