package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Miel extends ProduitAbeille {

    /**
     * Default constructor
     */
    public Miel() {
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}