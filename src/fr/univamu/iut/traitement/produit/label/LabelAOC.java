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
            System.out.println("Labelisable");
        } else {
            System.out.println("Produit non labelisable");
        }
    }

    @Override
    public String toString() {
        return "Label AOC";
    }
}