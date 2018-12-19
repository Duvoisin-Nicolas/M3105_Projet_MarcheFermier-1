package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Carotte extends Legume {

    /**
     * Default constructor
     */
    public Carotte() {
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}