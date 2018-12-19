package fr.univamu.iut.traitement.produit;

import java.time.LocalDate;

/**
 * 
 */
public abstract class Cereale extends ProduitFermier {

    /**
     * Default constructor
     */
    public Cereale(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

}