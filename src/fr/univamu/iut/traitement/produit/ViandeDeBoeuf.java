package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
/**
 * 
 */
public class ViandeDeBoeuf extends Viande {

    /**
     * Default constructor
     */
    public ViandeDeBoeuf() {
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}