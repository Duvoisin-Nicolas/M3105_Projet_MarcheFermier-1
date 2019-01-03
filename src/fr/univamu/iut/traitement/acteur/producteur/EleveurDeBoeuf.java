package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionViandeDeBoeuf;
import fr.univamu.iut.traitement.production.UniteDeProduction;

public class EleveurDeBoeuf extends Eleveur {

    private ProductionViandeDeBoeuf productionViandeDeBoeuf;

    public EleveurDeBoeuf() {
        super();
    }

    @Override
    public void setProduction(UniteDeProduction uniteDeProduction) {
        if (uniteDeProduction.getClass().equals("ProductionViandeDeBoeuf")) {
            this.productionViandeDeBoeuf = (ProductionViandeDeBoeuf) uniteDeProduction;
        }
    }

    @Override
    public void produire() {
        this.ajouterProduit(productionViandeDeBoeuf.fabriquer());
    }
}
