package fr.univamu.iut.traitement.acteur.producteur;

import fr.univamu.iut.traitement.production.ProductionOeuf;
import fr.univamu.iut.traitement.production.UniteDeProduction;

public class EleveurDePoule extends Eleveur {

    private ProductionOeuf productionOeuf;

    public EleveurDePoule() {
        super();
    }

    @Override
    public void setProduction(UniteDeProduction uniteDeProduction) {
        if (uniteDeProduction.getClass().getSimpleName().equals("ProductionOeuf")) {
            this.productionOeuf = (ProductionOeuf) uniteDeProduction;
        }
    }

    public ProductionOeuf getProductionOeuf() {
        return productionOeuf;
    }

    @Override
    public void produire() {
        if (productionOeuf != null)
            this.ajouterProduit(productionOeuf.fabriquer());
    }
}
