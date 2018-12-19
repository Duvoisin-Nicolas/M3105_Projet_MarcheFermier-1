package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Fromage;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionFromage extends UniteDeProduction {

    public ProductionFromage(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Fromage(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}