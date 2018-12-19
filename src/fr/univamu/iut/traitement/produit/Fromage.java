package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Fromage extends ProduitLaitier {

    /**
     * Default constructor
     */
    public Fromage(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void labeliser(ILabel label) {
        label.valider(this);
    }

}