package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;

/**
 * 
 */
public class Ble extends Cereale {

    /**
     * Default constructor
     */
    public Ble() {
    }

    @Override
    public void valider(ILabel label) {
        label.valider(this);
    }

}