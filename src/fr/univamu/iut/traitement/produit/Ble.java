package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Ble extends Cereale{

    private static Set<IObservateur> mesAbonnes = new HashSet<>();

    /**
     *
     */
    public Ble(LocalDate datePeremption, int quantite) {
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