package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Pomme extends Fruit {

    /**
     * Default constructor
     */
    public Pomme(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void notifier() {
        //TODO
    }
}