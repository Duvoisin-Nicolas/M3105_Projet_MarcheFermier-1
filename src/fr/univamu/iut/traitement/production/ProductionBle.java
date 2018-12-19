package fr.univamu.iut.traitement.production;

import fr.univamu.iut.traitement.produit.Ble;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 */
public class ProductionBle extends UniteDeProduction {

    /**
     * Constructeur d'une unite de production avec une capacite de production définie
     */
    public ProductionBle(int capaciteDeProduction) {
        super(capaciteDeProduction);
    }

    @Override
    public ProduitFermier fabriquer() {
        return new Ble(LocalDate.now().plus(30, ChronoUnit.DAYS),getCapaciteDeProduction());
    }
}