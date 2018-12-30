import fr.univamu.iut.traitement.Controleur;
import fr.univamu.iut.traitement.Marche;
import fr.univamu.iut.traitement.acteur.Grossiste;
import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.acteur.Trader;
import fr.univamu.iut.traitement.acteur.producteur.*;
import fr.univamu.iut.traitement.production.*;

import java.util.ArrayList;

public class Main {
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

        for (Participant participant : tousLesParticipantsDuMarche) {
            if (participant instanceof Producteur) {
                ((Producteur) participant).produire();
            }

        }

    }//main
}
