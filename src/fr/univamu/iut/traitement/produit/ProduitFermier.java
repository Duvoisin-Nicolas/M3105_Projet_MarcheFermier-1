package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 *
 */
public abstract class ProduitFermier {

    /**
     * @param datePeremption
     * @param quantite
     */
    public ProduitFermier(LocalDate datePeremption, int quantite) {
        this.datePeremption = datePeremption;
        this.quantite = quantite;
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
    protected HashSet<ILabel> mesLabelsValides;

    /**
     *
     */
    protected boolean isVendable;

    /**

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

    /**
     *
     * @return
     */
    public boolean isVendable() {
        return isVendable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduitFermier that = (ProduitFermier) o;
        return quantite == that.quantite &&
                isVendable == that.isVendable &&
                Objects.equals(datePeremption, that.datePeremption) &&
                Objects.equals(mesLabelsValides, that.mesLabelsValides);
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public int getQuantite() {
        return quantite;
    }

    public HashSet<ILabel> getMesLabelsValides() {
        return mesLabelsValides;
    }
}