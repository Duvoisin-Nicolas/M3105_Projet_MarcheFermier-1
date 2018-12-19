package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Carotte;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionCarotte extends UniteDeProduction {

    /**
     * Default constructor
     */
    public ProductionCarotte(int capaciteDeProducion) {
        super(capaciteDeProducion);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Carotte(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}