package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class ProduitElevage extends ProduitFermier {

    /**
     * Default constructor
     */
    public ProduitElevage(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}