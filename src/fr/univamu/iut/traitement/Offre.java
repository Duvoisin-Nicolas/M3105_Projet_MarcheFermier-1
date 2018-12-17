package fr.univamu.iut.traitement;

import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * 
 */
public class Offre {

    /**
     * Default constructor
     */
    public Offre(Participant vendeur, ProduitFermier produitEnVente, int prix) {
        Vendeur = vendeur;
        ProduitEnVente = produitEnVente;
        this.prix = prix;
    }


    /**
     *
     */
    private Participant Vendeur;

    /**
     *
     */
    private ProduitFermier ProduitEnVente;

    /**
     * 
     */
    private int prix;

}