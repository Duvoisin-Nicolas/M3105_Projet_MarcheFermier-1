package fr.univamu.iut.traitement.produit.label;

import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * 
 */
public class LabelAOC implements ILabel {

    /**
     * Default constructor
     */
    public LabelAOC() {
    }

    @Override
    public void valider(ProduitFermier produit) {
        if (produit.isVendable())
            produit.getMesLabelsValides().add(this);
    }

    @Override
    public String toString() {
        return "Label AOC";
    }
}