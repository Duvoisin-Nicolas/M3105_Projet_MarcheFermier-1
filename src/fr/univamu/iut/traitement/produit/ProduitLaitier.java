package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class ProduitLaitier extends ProduitFermier {

    /**
     * Default constructor
     */
    public ProduitLaitier(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}