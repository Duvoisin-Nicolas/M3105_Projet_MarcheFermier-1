import fr.univamu.iut.traitement.Controleur;
import fr.univamu.iut.traitement.Marche;
import fr.univamu.iut.traitement.Offre;
import fr.univamu.iut.traitement.acteur.Grossiste;
import fr.univamu.iut.traitement.acteur.Participant;
import fr.univamu.iut.traitement.acteur.Trader;
import fr.univamu.iut.traitement.acteur.producteur.*;
import fr.univamu.iut.traitement.production.*;
import fr.univamu.iut.traitement.produit.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * fonction pour afficher tous les participants du Marche
     * //todo faire en sorte que ce soit le Marche qui permette d'acceder à ses participants
     * @param participants
     */
    public static void VueDesParticipants (ArrayList<Participant> participants) {
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }//VueDesParticipants

    /**
     * fonction pour afficher toutes les offres du Marche
     * @param marche
     */
    public static void VueDuCatalogue (Marche marche) {
        for (Offre offre : marche.getOffres()) {
            System.out.println(offre);
        }
    }//VueDuCatalogue

    /**
     * fonction pour afficher les transaction en temps réel
     * @param marche
     */
    public static void VueDuJournalDesTransactions (Marche marche) {
        //TODO issue #37
    }

    /**
     * fonction pour afficher les cotations de chaque produit du Marche
     * @param marche
     */
    public static void VueDesCotations (Marche marche) {
        ArrayList<ProduitFermier> produitsDuMarche = new ArrayList<>();
        for (Offre offre : marche.getOffres()) {
            for (ProduitFermier produit : produitsDuMarche) {
                if (offre.getProduitEnVente().getClass() == produit.getClass()) {

                }
            }
        }
    }//VueDesCotisations

    public static void main (String [] args) {
        System.out.println("Initialisation du marché");
        Marche marche = new Marche();
        System.out.println("Création du contrôleur");
        Controleur controleur = new Controleur();

        System.out.println("Création des productions");
        ProductionBle productionBle = new ProductionBle(600);
        ProductionCarotte productionCarotte = new ProductionCarotte(650);
        ProductionFromage productionFromage = new ProductionFromage(550);
        ProductionMiel productionMiel = new ProductionMiel(700);
        ProductionOeuf productionOeuf = new ProductionOeuf(500);
        ProductionPomme productionPomme = new ProductionPomme(750);
        ProductionViandeDeBoeuf productionViandeDeBoeuf = new ProductionViandeDeBoeuf(450);

        ArrayList<Participant> tousLesParticipantsDuMarche = new ArrayList<>();
        ArrayList<Producteur> tousLesProducteursDuMarche = new ArrayList<>();

        System.out.println("Apiculteur ajouté");
        Apiculteur apiculteur = new Apiculteur();
        apiculteur.setProductionMiel(productionMiel);
        tousLesParticipantsDuMarche.add(apiculteur);
        tousLesProducteursDuMarche.add(apiculteur);

        System.out.println("Arboriculteur ajouté");
        Arboriculteur arboriculteur = new Arboriculteur();
        arboriculteur.setProductionPomme(productionPomme);
        tousLesParticipantsDuMarche.add(arboriculteur);
        tousLesProducteursDuMarche.add(arboriculteur);


        System.out.println("Céréalier ajouté");
        Cerealier cerealier = new Cerealier();
        cerealier.setProductionBle(productionBle);
        tousLesParticipantsDuMarche.add(cerealier);
        tousLesProducteursDuMarche.add(cerealier);


        System.out.println("Eleveur de Poule ajouté");
        EleveurDePoule eleveurDePoule = new EleveurDePoule();
        eleveurDePoule.setProduction(productionOeuf);
        tousLesParticipantsDuMarche.add(eleveurDePoule);
        tousLesProducteursDuMarche.add(eleveurDePoule);

        System.out.println("Eleveur de Boeuf ajouté");
        EleveurDeBoeuf eleveurDeBoeuf = new EleveurDeBoeuf();
        eleveurDeBoeuf.setProduction(productionViandeDeBoeuf);
        tousLesParticipantsDuMarche.add(eleveurDeBoeuf);
        tousLesProducteursDuMarche.add(eleveurDeBoeuf);

        System.out.println("Horticulteur ajouté");
        Horticulteur horticulteur = new Horticulteur();
        horticulteur.setProductionCarotte(productionCarotte);
        tousLesParticipantsDuMarche.add(horticulteur);
        tousLesProducteursDuMarche.add(horticulteur);

        System.out.println("Producteur de lait ajouté");
        ProducteurLaitier producteurLaitier = new ProducteurLaitier();
        producteurLaitier.setProductionFromage(productionFromage);
        tousLesParticipantsDuMarche.add(producteurLaitier);
        tousLesProducteursDuMarche.add(producteurLaitier);

        System.out.println("Grossite ajouté");
        Grossiste grossiste = new Grossiste();
        tousLesParticipantsDuMarche.add(grossiste);

        System.out.println("Trader ajouté");
        Trader trader = new Trader();
        tousLesParticipantsDuMarche.add(trader);

        //Test de l'observeur pour les notifications
        System.out.println("Abonnement du grossiste");
        productionBle.fabriquer().ajouterAbonne(grossiste);
        productionPomme.fabriquer().ajouterAbonne(grossiste);
        productionPomme.fabriquer().ajouterAbonne(grossiste);
        productionPomme.fabriquer().ajouterAbonne(grossiste);
        productionCarotte.fabriquer().ajouterAbonne(grossiste);

        //Début de la simulation
        System.out.println("\n");
        int tour = 0;
        while (true) {
            System.out.println("/* Tour "+ ++tour + " */");

            System.out.println("Productions des producteurs");
            for (Producteur producteur : tousLesProducteursDuMarche) {
                producteur.produire();
            }

            System.out.println("Produits mis en vente :");

            //Création d'un tableau qui contiendra toutes les personnes suceptibles de vendre
            ArrayList<Participant> participantsAvecObjetsAVendre = new ArrayList<>();
            for (Participant p : tousLesParticipantsDuMarche) {
                if (!p.getInventaire().isEmpty()) {
                    participantsAvecObjetsAVendre.add(p);
                }
            }
            //Random pour déterminer le nombre de personnes qui vont vendre ce tour
            int randomNbPersonnesVendeuses = (int) (Math.random() * participantsAvecObjetsAVendre.size());

            //Mise en vente des objets
            for (int i = 0 ; i<randomNbPersonnesVendeuses ; ++i) {
                int randomIndiceVendeur = (int) (Math.random() * participantsAvecObjetsAVendre.size()-1);
                Participant p = participantsAvecObjetsAVendre.get(randomIndiceVendeur);
                int randomIndiceObjetVendu = (int) (Math.random() * p.getInventaire().size()-1);
                ProduitFermier produitFermier = p.getInventaire().get(randomIndiceObjetVendu);
                int randomPrixObjet = (int) (Math.random() * 30 + 1);
                //TODO : Définir un prix plus "honette"
                System.out.println(p.getId() + " à mis en vente un lot de " + produitFermier + " au prix de " + randomPrixObjet);
                p.creerOffreAchat(new Offre(participantsAvecObjetsAVendre.get(randomIndiceVendeur),produitFermier,randomPrixObjet));
                //TODO : Gérer le fait on ne peux pas mettre le même produit dans 2 offres différentes (faire un tableau de produits en vente en cours dans participant et le tester ici)
            }

            //TODO : Ajouter l'achat des objets
            //TODO : Compléter ce qu'il manque en relisant le sujet

            //Attente que l'utilisateur appuye sur entrée
            while (true){
                System.out.println("Appuyez sur Entrée pour continuer");
                Scanner in = new Scanner(System.in);
                String s = in.nextLine();
                if(s.equals("")) {
                    break;
                }
            }
        }

        /*
        eleveurDeBoeuf.produire();
        System.out.println(eleveurDeBoeuf.getInventaire());
        for (ProduitFermier produit : eleveurDeBoeuf.getInventaire()) {
            System.out.println(produit.getQuantite());
        }



        Offre offre_pomme = new Offre(horticulteur,productionPomme.fabriquer(),50);
        Offre offre_ble = new Offre(horticulteur,productionBle.fabriquer(),50);
        //Fin test de l'observeur

        */

    }//main
}
