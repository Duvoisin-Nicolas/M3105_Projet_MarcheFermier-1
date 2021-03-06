package fr.univamu.iut.traitement.produit.label;

import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * 
 */
public class LabelIGP implements ILabel {

    /**
     * Default constructor
     */
    public LabelIGP() {
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
        return "Label IGP";
    }
}