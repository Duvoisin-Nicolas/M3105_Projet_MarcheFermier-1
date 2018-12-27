package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionOeuf;
import fr.univamu.iut.traitement.production.ProductionViandeDeBoeuf;

/**
 * 
 */
public class Eleveur extends Producteur {

    private static int compteurId = 0;
    private ProductionViandeDeBoeuf productionViandeDeBoeuf;
    private ProductionOeuf productionOeuf;
    /**
     * Default constructor
     */
    public Eleveur() {
        this.setId("Eleveur " + ++compteurId);
    }

    public void setProductionViandeDeBoeuf(ProductionViandeDeBoeuf productionViandeDeBoeuf) {
        this.productionViandeDeBoeuf = productionViandeDeBoeuf;
    }

    public void setProductionOeuf(ProductionOeuf productionOeuf) {
        this.productionOeuf = productionOeuf;
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionViandeDeBoeuf.fabriquer());
        this.ajouterProduit(productionOeuf.fabriquer());
    }

}