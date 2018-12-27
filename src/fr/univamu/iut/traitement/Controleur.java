package fr.univamu.iut.traitement;

import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.produit.ProduitFermier;

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
     * Permet de choisir qui achète une offr.
     * @param offre
     * @param acheteur
     */
    public void choisirAcheteur(Offre offre, Participant acheteur){
        if(offre.checkAcheteur(acheteur)){


            if(acheteur.getSolde() >= offre.getPrix()){
                offre.getVendeur().vente(offre.getPrix());
                acheteur.achat(offre.getPrix());

            }
            else{
                System.out.println("Solde insuffisant de l'acheteur");
            }

        }
    }

    /**
     * 
     */
    public boolean verifierStock(Offre offre) {
        // TODO implement here
        /*
        for(ProduitFermier produitFermier : offre.getVendeur().getInventaire()){
                if(offre.getProduitEnVente() == produitFermier ){      //à modifier
                    return true;    // le produit a été trouvé
                }
        }
        return false; //le produit n'a pas été trouvé
        */
        return true;
    }

    /**
     * 
     */
    public boolean verifierOffre(Offre offre) {
        // TODO implement here
        offre.getProduitEnVente().valider(); // On vérifie si le produit est toujours vendable
        if(offre.getProduitEnVente().isVendable()){
            if(verifierStock(offre)){ // On vérifie si le vendeur a en stock le produit en vente
                return  true;
            }
        }
        return false;
    }

}