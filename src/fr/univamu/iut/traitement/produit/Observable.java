package fr.univamu.iut.traitement.produit;

import fr.univamu.iut.traitement.acteur.IObservateur;

public abstract class Observable {

    public abstract void ajouterAbonne(IObservateur observateur);

    public abstract void retirerAbonne(IObservateur observateur);

    public abstract void notifier();
}
