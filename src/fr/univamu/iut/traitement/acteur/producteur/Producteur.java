package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.acteur.Participant;

/**
 * 
 */
public abstract class Producteur extends Participant {

    private String id;
    /**
     * Default constructor
     */
    public Producteur() {}

    /**
     * Fonction permettant de produire l'objet de sa factory
     */
    public abstract void produire();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}