package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * Cette interface correspond à la Fabrique que vont implémenter toutes les unités de production concrètes
 */
public interface UnitéDeProduction {

    /**
     * @return ProduitFermier (abstrait)
     */
    public ProduitFermier fabriquer();

}