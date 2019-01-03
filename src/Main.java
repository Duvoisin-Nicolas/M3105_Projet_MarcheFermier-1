import fr.univamu.iut.traitement.Controleur;
import fr.univamu.iut.traitement.Marche;
import fr.univamu.iut.traitement.Offre;
import fr.univamu.iut.traitement.acteur.Grossiste;
import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.acteur.Trader;
import fr.univamu.iut.traitement.acteur.producteur.*;
import fr.univamu.iut.traitement.production.*;
import fr.univamu.iut.traitement.produit.ProduitFermier;

import java.util.ArrayList;

public class Main {

    /**
     * fonction pour afficher tous les participants du Marche
     * //todo faire en sorte que ce soit le Marche qui permette d'acceder à ses participants
     * @param participants
     */
    public void VueDesParticipants (ArrayList<Participant> participants) {
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }//VueDesParticipants

    /**
     * fonction pour afficher toutes les offres du Marche
     * @param marche
     */
    public void VueDuCatalogue (Marche marche) {
        for (Offre offre : marche.getOffres()) {
            System.out.println(offre);
        }
    }//VueDuCatalogue

    /**
     * fonction pour afficher les transaction en temps réel
     * @param marche
     */
    public void VueDuJournalDesTransactions (Marche marche) {
        //TODO issue #37
    }

    /**
     * fonction pour afficher les cotations de chaque produit du Marche
     * @param marche
     */
    public void VueDesCotations (Marche marche) {
        ArrayList<ProduitFermier> produitsDuMarche = new ArrayList<>();
        for (Offre offre : marche.getOffres()) {
            for (ProduitFermier produit : produitsDuMarche) {
                if (offre.getProduitEnVente().getClass() == produit.getClass()) {

                }
            }
        }
    }//VueDesCotisations

    public void main (String [] args) {
        Marche marche = new Marche();
        Controleur controleur = new Controleur();

        ProductionBle productionBle = new ProductionBle(600);
        ProductionCarotte productionCarotte = new ProductionCarotte(650);
        ProductionFromage productionFromage = new ProductionFromage(550);
        ProductionMiel productionMiel = new ProductionMiel(700);
        ProductionOeuf productionOeuf = new ProductionOeuf(500);
        ProductionPomme productionPomme = new ProductionPomme(750);
        ProductionViandeDeBoeuf productionViandeDeBoeuf = new ProductionViandeDeBoeuf(450);

        ArrayList<Participant> tousLesParticipantsDuMarche = new ArrayList<>();

        tousLesParticipantsDuMarche.add(new Apiculteur());
        tousLesParticipantsDuMarche.add(new Arboriculteur());
        tousLesParticipantsDuMarche.add(new Cerealier());
        tousLesParticipantsDuMarche.add(new Eleveur());
        tousLesParticipantsDuMarche.add(new Horticulteur());
        tousLesParticipantsDuMarche.add(new ProducteurLaitier());
        tousLesParticipantsDuMarche.add(new Grossiste());
        tousLesParticipantsDuMarche.add(new Trader());


    }//main
}
