package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

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