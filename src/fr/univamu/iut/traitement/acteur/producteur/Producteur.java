package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.acteur.Participant;

/**
 * 
 */
public abstract class Producteur extends Participant {

    /**
     * Default constructor
     */
    public Producteur() {}

    /**
     * Fonction permettant de produire l'objet de sa factory
     */
    public abstract void produire();


}