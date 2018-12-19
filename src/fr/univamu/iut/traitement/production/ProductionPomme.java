package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Pomme;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionPomme extends UniteDeProduction {

    /**
     * Default constructor
     */
    public ProductionPomme(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Pomme(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}