package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class Viande extends ProduitElevage {

    /**
     * Default constructor
     */
    public Viande(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}