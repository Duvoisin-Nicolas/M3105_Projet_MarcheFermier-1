package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Oeuf extends ProduitElevage {

    /**
     * Default constructor
     */
    public Oeuf() {
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}