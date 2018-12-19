package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionBle;

/**
 * 
 */
public class Cerealier extends Producteur {

    private static int compteurId = 0;
    private ProductionBle productionBle = new ProductionBle();
    /**
     * Default constructor
     */
    public Cerealier() {
        this.setId("Céréalier " + ++compteurId);
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionBle.fabriquer());
    }
}