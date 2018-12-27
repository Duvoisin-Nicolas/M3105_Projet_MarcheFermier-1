package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionMiel;

/**
 * 
 */
public class Apiculteur extends Producteur {

    private static int compteurId = 0;

    private ProductionMiel productionMiel;
    /**
     * Default constructor
     */
    public Apiculteur() {
        this.setId("Apiculteur " + ++compteurId);
    }

    public void setProductionMiel(ProductionMiel productionMiel) {
        this.productionMiel = productionMiel;
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionMiel.fabriquer());
    }
}