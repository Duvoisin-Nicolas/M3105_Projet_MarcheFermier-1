package fr.univamu.iut.traitement.acteur.cotisation;

import fr.univamu.iut.traitement.acteur.Participant;

/**
 * 
 */
public class CotisationBase implements ICotisation {

    private Participant participant;

    /**
     *@param participant récupére les caractéristiques du participant pour un calcul juste de la cotisation
     */
    public CotisationBase(Participant participant) {
        this.participant = participant;
    }

    @Override
    public double calculerCotisation() {
        return participant.getGain () * 0.1;
    }
}