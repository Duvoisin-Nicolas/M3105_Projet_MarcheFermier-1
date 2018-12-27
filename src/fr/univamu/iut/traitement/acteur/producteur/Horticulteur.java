package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionCarotte;

/**
 * 
 */
public class Horticulteur extends Producteur {

    private static int compteurId = 0;
    private ProductionCarotte productionCarotte;
    /**
     * Default constructor
     */
    public Horticulteur() {
        this.setId("Horticulteur " + ++compteurId);
    }

    public void setProductionCarotte(ProductionCarotte productionCarotte) {
        this.productionCarotte = productionCarotte;
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionCarotte.fabriquer());
    }

}