package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.produit.label.ILabel;
import java.time.LocalDate;

/**
 * 
 */
public class Ble extends Cereale {

    /**
     *
     */
    public Ble(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }
}