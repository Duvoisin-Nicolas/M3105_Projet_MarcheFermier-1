package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Oeuf extends ProduitElevage {

    /**
     * Default constructor
     */
    public Oeuf(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}