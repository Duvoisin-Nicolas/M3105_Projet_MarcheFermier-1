package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Pomme extends Fruit {

    /**
     * Default constructor
     */
    public Pomme() {
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}