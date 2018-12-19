package fr.univamu.iut.traitement.acteur;

/**
 * 
 */
public class Grossiste extends Participant {

    private static int compteurId = 0;

    /**
     * Default constructor
     */
    public Grossiste() {
        this.setId("Grossite " + compteurId);
    }

}