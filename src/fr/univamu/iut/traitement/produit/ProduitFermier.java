package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 *
 */
public abstract class ProduitFermier {

    /**
     * Default constructor
     */
    public ProduitFermier() {
    }

    /**
     *
     */
    protected LocalDate datePeremption;

    /**
     *
     */
    protected int quantite;

    /**
     *
     */
    protected boolean isVendable;

    /**
     *
     */
    public abstract void valider();

}