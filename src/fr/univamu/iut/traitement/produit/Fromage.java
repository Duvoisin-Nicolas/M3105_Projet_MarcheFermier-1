package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Fromage extends ProduitLaitier {

    private static Set<IObservateur> mesAbonnes = new HashSet<>();

    /**
     * Default constructor
     */
    public Fromage(LocalDate datePeremption, int quantite) {
        super(datePeremption,quantite);
    }

    @Override
    public void ajouterAbonne(IObservateur observateur) {
        mesAbonnes.add(observateur);
    }

    @Override
    public void retirerAbonne(IObservateur observateur) {
        mesAbonnes.remove(observateur);
    }

    @Override
    public void notifier(){
        for(IObservateur observateur : mesAbonnes){
            observateur.mettreAJour(this);
        }
    }
}