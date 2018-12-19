package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionMiel;

/**
 * 
 */
public class Apiculteur extends Producteur {

    private static int compteurId = 0;
    private ProductionMiel productionMiel = new ProductionMiel();
    /**
     * Default constructor
     */
    public Apiculteur() {
        this.setId("Apiculteur " + ++compteurId);
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionMiel.fabriquer());
    }
}