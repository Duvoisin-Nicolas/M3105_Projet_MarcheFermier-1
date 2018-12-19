package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionOeuf;
import fr.univamu.iut.traitement.production.ProductionViandeDeBoeuf;

/**
 * 
 */
public class Eleveur extends Producteur {

    private static int compteurId = 0;
    private ProductionViandeDeBoeuf productionViandeDeBoeuf = new ProductionViandeDeBoeuf();
    private ProductionOeuf productionOeuf = new ProductionOeuf();
    /**
     * Default constructor
     */
    public Eleveur() {
        this.setId("Eleveur " + ++compteurId);
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionViandeDeBoeuf.fabriquer());
        this.ajouterProduit(productionOeuf.fabriquer());
    }

}