package fr.univamu.iut.traitement.acteur;

import fr.univamu.iut.traitement.produit.ProduitFermier;

public interface IObservateur {

    void mettreAJour(ProduitFermier produit);

}
