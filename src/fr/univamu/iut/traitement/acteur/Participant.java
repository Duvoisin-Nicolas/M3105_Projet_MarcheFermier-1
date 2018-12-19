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
     * Id du participant
     */
    private String id;

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
    private List<ProduitFermier> inventaire = new ArrayList<ProduitFermier>();

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

    /**
     *
     * @param produitFermier
     */
    public void ajouterProduit (ProduitFermier produitFermier) {
        inventaire.add(produitFermier);
    }

    /**
     *
     * @param produitFermier
     */
    public void retirerProduit (ProduitFermier produitFermier) {
        inventaire.remove(produitFermier);
    }

    /**
     *
     * @return
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Modifie le solde et le gain par un achat
     * @param prix
     */
    public void achat(double prix){
        solde -= prix;
        gain -= prix;
    }

    /**
     * Modifie le solde et le gain selon par une vente
     * @param prix
     */
    public void vente(double prix){
        solde += prix;
        gain += prix;
    }

    /**
     *
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     *
     * @return
     */
    public double getGain() {
        return gain;
    }

    /**
     *
     * @param gain
     */
    public void setGain(double gain) {
        this.gain = gain;
    }

    /**
     *
     * @return
     */
    public List<ProduitFermier> getInventaire() {
        return inventaire;
    }

    /**
     *
     * @param inventaire
     */
    public void setInventaire(List<ProduitFermier> inventaire) {
        this.inventaire = inventaire;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}