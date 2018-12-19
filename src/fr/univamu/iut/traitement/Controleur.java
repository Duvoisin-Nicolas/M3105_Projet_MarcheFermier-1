package fr.univamu.iut.traitement;

import fr.univamu.iut.traitement.acteur.Participant;

/**
 * 
 */
public class Controleur {

    /**
     * Default constructor
     */
    public Controleur() {
    }



    /**
     * 
     */
    public void choisirAcheteur(Offre offre, Participant acheteur){
        if(offre.checkAcheteur(acheteur)){

            /*
            if(acheteur.getSolde() >= offre.getPrix()){
                offre.getVendeur().vente(offre.getPrix());
                acheteur.achat(offre.getPrix());

            }
            else{
                System.out.println("Solde insuffisant de l'acheteur");
            }
            */
        }
    }

    /**
     * 
     */
    public void verifierStock() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verifierOffre() {
        // TODO implement here
    }

}