package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * Cette classe abstraite correspond à la Fabrique que vont implémenter toutes les unités de production concrètes
 */
public abstract class UniteDeProduction {

    /**
     * Quantité de ProduitFermier par appel à fabriquer()
     */
    private int capaciteDeProduction;

    public UniteDeProduction(int capaciteDeProduction) {
        this.capaciteDeProduction = capaciteDeProduction;
    }

    /**
     * @return ProduitFermier (abstrait)
     */
    public abstract ProduitFermier fabriquer();

}