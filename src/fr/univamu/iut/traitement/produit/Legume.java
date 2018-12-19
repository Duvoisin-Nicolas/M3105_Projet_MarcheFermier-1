package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class Legume extends ProduitFermier {

    /**
     * Default constructor
     */
    public Legume(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}