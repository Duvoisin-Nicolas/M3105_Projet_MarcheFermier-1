package fr.univamu.iut.traitement;

import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.util.ArrayList;

/**
 * 
 */
public class Offre {

    /**
     * Booleen qui est à true lorsque l'offre est toujours en vente et à false lorsqu'elle n'est plus en vente (déjà vendu ou le vendeur à retirer l'annonce)
     */
    private boolean estDisponible;

    /**
     * Liste des acheteurs potentiels
     */
    private ArrayList<Participant> Acheteurs;

    /**
     *  Participant ayant publié l'offre
     */
    private Participant Vendeur;

    /**
     *
     */
    private ProduitFermier ProduitEnVente;

    /**
     *  Prix de l'offre
     */
    private int prix;


    /**
     * Participant ayant acheté l'offre (sert à conserver l'acheteur pour un historique
     */
    private Participant Acheteur;

    /**
     * Default constructor
     */
    public Offre(Participant vendeur, ProduitFermier produitEnVente, int prix) {
        Vendeur = vendeur;
        ProduitEnVente = produitEnVente;
        this.prix = prix;
        Acheteurs = new ArrayList<Participant>();
        estDisponible = true;

        Acheteur = null;
    }


    /**
     *
     * @return
     */
    public boolean isEstDisponible() {
        return estDisponible;
    }

    /**
     * Verifie si l'acheteur passé en paramètre est bien dans la liste des acheteurs potentiels
     * @param participant
     * @return
     */
    public boolean checkAcheteur(Participant participant){
        if(Acheteurs.contains(participant)) {
            return true;
        }
        else{
            System.out.println("L'acheteur demandé n'est pas dans la liste des acheteurs potentiels");
            return  false;
        }
    }

    /**
     * Fonction permettant de valider la vente d'un produit (fermeture de l'offre, changement d'inventaire)
     * @param acheteur
     */
    public void vente(Participant acheteur){

        //Annonce plus disponible et Acheteur définie
        this.setEstDisponible(false);
        Acheteur = acheteur;

        //Déplacement du Produit
        acheteur.ajouterProduit(ProduitEnVente);
        this.getVendeur().retirerProduit(ProduitEnVente);

    }

    /**
     *
     * @return
     */
    public int getPrix() {
        return prix;
    }

    /**
     *
     * @return
     */
    public Participant getVendeur() {
        return Vendeur;
    }

    /**
     *
     * @param estDisponible
     */
    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    /**
     *
     * @return
     */
    public ProduitFermier getProduitEnVente() {
        return ProduitEnVente;
    }

    /**
     * Fonction permettant d'ajouter un acheteur potentiel à la liste
     * @param p
     */
    public void addAcheteur(Participant p){
        Acheteurs.add(p);
    }

    /**
     * Fonction permettant de retirer un acheteur potentiel de la liste
     * @param p
     */
    public void removeAcheteur(Participant p){
        Acheteurs.remove(p);
    }


}