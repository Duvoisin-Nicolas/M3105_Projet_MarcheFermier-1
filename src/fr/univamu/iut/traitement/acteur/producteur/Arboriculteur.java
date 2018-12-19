package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionPomme;

/**
 * 
 */
public class Arboriculteur extends Producteur {

    private static int compteurId = 0;
    private ProductionPomme productionPomme = new ProductionPomme();
    /**
     * Default constructor
     */
    public Arboriculteur() {
        this.setId("Arboriculteur " + ++compteurId);
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionPomme.fabriquer());
    }

}