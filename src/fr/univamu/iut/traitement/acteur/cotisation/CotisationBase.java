package fr.univamu.iut.traitement.acteur.cotisation;

import fr.univamu.iut.traitement.acteur.producteur.Producteur;

/**
 * 
 */
public class CotisationBase implements ICotisation {

    private Producteur producteur;

    /**
     *@param producteur récupére les caractéristiques du producteur pour un calcul juste de la cotisation
     */
    public CotisationBase(Producteur producteur) {
        this.producteur = producteur;
    }

    @Override
    public double calculerCotisation() {
        return 0;
    }
}