package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Oeuf;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionOeuf extends UniteDeProduction {

    /**
     * Default constructor
     */
    public ProductionOeuf(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Oeuf(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}