package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionFromage;

/**
 * 
 */
public class ProducteurLaitier extends Producteur {

    private static int compteurId = 0;
    private ProductionFromage productionFromage;
    /**
     * Default constructor
     */
    public ProducteurLaitier() {
        this.setId("Producteur Laitier " + ++compteurId);
    }

    public void setProductionFromage(ProductionFromage productionFromage) {
        this.productionFromage = productionFromage;
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionFromage.fabriquer());
    }

}