package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Miel extends ProduitAbeille {

    /**
     * Default constructor
     */
    public Miel(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}