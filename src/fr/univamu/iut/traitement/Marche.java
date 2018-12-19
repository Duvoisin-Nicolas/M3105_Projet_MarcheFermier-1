package fr.univamu.iut.traitement;

import java.util.ArrayList;

/**
 * 
 */
public class Marche {

    /**
     * Default constructor
     */
    public Marche() {
        offres = new ArrayList<Offre>();
    }

    /**
     *
     */
    private ArrayList<Offre> offres;

    /**
     * Retourne la liste des offres du marché
     * @return ArrayList<Offre>
     */
    public ArrayList<Offre> getOffres() {
        return offres;
    }

    /**
     * Permet d'ajouter une offre au marché
     * @param offre
     */
    public void addOffre(Offre offre){
        this.offres.add(offre);
    }

    /**
     * Permet de supprimer une offre du marché
     * @param offre
     */
    public void removeOffre(Offre offre){
        this.offres.remove(offre);
    }


}