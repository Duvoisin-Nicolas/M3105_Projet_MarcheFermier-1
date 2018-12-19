package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

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
    public abstract void labeliser(ILabel label);

    /**
     *
     */
    public void valider(){
        if(this.datePeremption.isAfter(LocalDate.now())){
            this.isVendable = true;
        }
        else{
            this.isVendable = false;
        }
    }

}