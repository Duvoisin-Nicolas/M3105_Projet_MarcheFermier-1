package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import fr.univamu.iut.traitement.produit.label.LabelAOC;

import java.time.LocalDate;

/**
 * 
 */
public class ViandeDeBoeuf extends Viande {

    /**
     * Default constructor
     */
    public ViandeDeBoeuf(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void notifier() {
        //TODO
    }
}