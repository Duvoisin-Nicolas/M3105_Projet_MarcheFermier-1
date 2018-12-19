package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class Fruit extends ProduitFermier {

    /**
     * Default constructor
     */
    public Fruit(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}