package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Carotte extends Legume {

    /**
     * Default constructor
     */
    public Carotte(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}