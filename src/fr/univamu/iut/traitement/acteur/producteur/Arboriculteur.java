package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionPomme;

/**
 * 
 */
public class Arboriculteur extends Producteur {

    private static int compteurId = 0;
    private ProductionPomme productionPomme;
    /**
     * Default constructor
     */
    public Arboriculteur() {
        this.setId("Arboriculteur " + ++compteurId);
    }

    public void setProductionPomme(ProductionPomme productionPomme) {
        this.productionPomme = productionPomme;
    }

    @Override
    public void produire() {
        if (productionPomme != null)
            this.ajouterProduit(productionPomme.fabriquer());
    }

}