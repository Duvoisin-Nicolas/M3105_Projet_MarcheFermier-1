package fr.univamu.iut.traitement.produit.label;

import fr.univamu.iut.traitement.produit.ProduitFermier;

/**
 * 
 */
public interface ILabel {

    boolean valider(ProduitFermier produit);
}