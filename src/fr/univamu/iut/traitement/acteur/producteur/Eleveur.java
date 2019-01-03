package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionOeuf;
import fr.univamu.iut.traitement.production.ProductionViandeDeBoeuf;
import fr.univamu.iut.traitement.production.UniteDeProduction;

/**
 * 
 */
public abstract class Eleveur extends Producteur {

    private static int compteurId = 0;

    /**
     * Default constructor
     */
    public Eleveur() {
        this.setId("Eleveur " + ++compteurId);
    }

    public abstract void setProduction (UniteDeProduction uniteDeProduction);

}