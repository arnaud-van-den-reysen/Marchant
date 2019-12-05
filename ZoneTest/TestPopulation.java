package ZoneTest;

import AffichageDebug.AffDebug;
import Moteur.Chemin;
import Moteur.Graphe;
import Moteur.Noeud;

public class TestPopulation {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int nb = 30;
    int iterationMutaSelect = 10000000;
    Graphe gr = new Graphe();
    Chemin ch = new Chemin();
    AffDebug aff = new AffDebug();
    
    Noeud[] ListeNoeuds = new Noeud[nb];
    ListeNoeuds = gr.generationNoeud(nb);
    
    Noeud[][] Population = new Noeud[nb][nb];
    for(int i = 0;i<nb;i++) {
      Population[i] = ListeNoeuds;
    }
    
    aff.affichagePopulationTailleCheminEtOrderChemin(Population, "Population");
    for(int i = 0;i<nb;i++) {
      Population[i] = ch.calculChemin(Population[i], iterationMutaSelect);
    }
    aff.affichagePopulationTailleCheminEtOrderChemin(Population, "Population");
  }

}
