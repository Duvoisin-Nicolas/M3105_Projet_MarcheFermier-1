package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {

    protected Set<IObservateur> mesAbonnes = new HashSet<>();

    public void ajouterAbonne(IObservateur observateur){
        mesAbonnes.add(observateur);
    }

    public void retirerAbonne(IObservateur observateur){
        mesAbonnes.remove(observateur);
    }

    public abstract void notifier();
}
