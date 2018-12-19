package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Miel;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionMiel extends UniteDeProduction {

    /**
     * Default constructor
     */
    public ProductionMiel(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Miel(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}