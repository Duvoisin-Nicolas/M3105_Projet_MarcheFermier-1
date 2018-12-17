package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Fromage extends ProduitLaitier {

    /**
     * Default constructor
     */
    public Fromage() {
    }

    @Override
    public void valider(ILabel label) {
        label.valider(this);
    }

}