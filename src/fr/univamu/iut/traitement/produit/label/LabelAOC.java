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
    public boolean valider(ProduitFermier produit) {
        if (produit.isVendable()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Label AOC";
    }
}