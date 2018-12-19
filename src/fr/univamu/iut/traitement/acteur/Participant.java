package fr.univamu.iut.traitement.acteur;

import fr.univamu.iut.traitement.Offre;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.util.ArrayList;
import java.util.List;

/**
 *  Interface correspondant à l'ensemble des acteurs du systeme
 */
public abstract class Participant {

    /**
     * Solde disponible de l'acteur
     */
    private double solde;

    /**
     * Gains générés par l'acteur
     */
    private double gain;

    /**
     * Tableau contenant l'inventaire de l'acteur ( ses objets à vendre )
     */
    private List<ProduitFermier> inventaire = new ArrayList<>();

    /**
     * Fonction permettant de créer une offre
     */
    public void creerOffreVente(int prix,ProduitFermier produitFermier) {
        Offre offre = new Offre(this,produitFermier,prix);
    }

    /**
     * Permet de postuler à une offre pour être sélectionner pour l'achat
     * @param offre : Offre dans laquelle on veut postuler
     */
    public void creerOffreAchat(Offre offre) {
        offre.addAcheteur(this);
    }


}