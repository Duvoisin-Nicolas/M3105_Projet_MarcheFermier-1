package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

import java.util.HashSet;

public abstract class Observable {

    private HashSet<IObservateur> mesAbonnes;

    public void ajouterAbonne(IObservateur observateur){
        mesAbonnes.add(observateur);
    }

    public void retirerAbonne(IObservateur observateur){
        mesAbonnes.remove(observateur);
    }

    public abstract void notifier();
}
