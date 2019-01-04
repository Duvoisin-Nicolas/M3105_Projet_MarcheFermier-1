package fr.univamu.iut.traitement.acteur;

/**
 * 
 */
public class Trader extends Participant {

    private static int compteurId = 0;

    /**
     * Default constructor
     */
    public Trader() {
        this.setId("Trader " + compteurId);
    }
}