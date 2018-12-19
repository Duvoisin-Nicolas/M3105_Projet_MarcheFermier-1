package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class ProduitAbeille extends ProduitFermier {

    /**
     * Default constructor
     */
    public ProduitAbeille(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}