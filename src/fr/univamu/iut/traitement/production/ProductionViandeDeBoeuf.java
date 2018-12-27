package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.ProduitFermier;
import fr.univamu.iut.traitement.produit.Viande;
import fr.univamu.iut.traitement.produit.ViandeDeBoeuf;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionViandeDeBoeuf extends UniteDeProduction {

    /**
     * Default constructor
     */
    public ProductionViandeDeBoeuf(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new ViandeDeBoeuf(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}