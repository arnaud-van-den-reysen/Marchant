package Interface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import AffichageDebug.AffDebug;
import Moteur.Chemin;
import Moteur.Graphe;
import Moteur.Noeud;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
    int nb = 10;
    int iterationMutaSelect = 20000000;
    Graphe gr = new Graphe();
    Chemin ch = new Chemin();
    AffDebug aff = new AffDebug();
    
    Noeud[] ListeNoeuds = new Noeud[nb];
    ListeNoeuds = gr.generationNoeud(nb);
    
    /**
     * Pour faire plusieurs population,
     * il faut contenir plusieurs ListeNoeuds identiques au début.
     * Puis faire des mutations individuellement,
     * sauvegarder toutes les mutations,
     * et finalement faire une séléction sur l'ensemble de la population.
     * Il faut conserver un grand ensemble de population,
     * et seulement à la toute fin,
     * faire une séléction du meilleur individu de la population.
     */
//    Noeud[][] Population = new Noeud[nb][nb];
//    for(int i = 0;i<nb;i++) {
//      Population[i] = ListeNoeuds;
//    }
//    
//    aff.affichagePopulationTailleCheminEtOrderChemin(Population, "Population");
    
    for(int i = 0;i<nb;i++) {
      if(i==0) {
        g.fillOval((int)ListeNoeuds[i].getX()-5, (int)ListeNoeuds[i].getY()-5, 20, 20);
      } else {
        g.fillOval((int)ListeNoeuds[i].getX()-5, (int)ListeNoeuds[i].getY()-5, 10, 10);
      }
    }
    
    /**
     * Affichage Chemin avant
     */
//    g.setColor(Color.GREEN);
//    for(int i = 0;i<ListeNoeuds.length;i++) {
//      if(i==ListeNoeuds.length-1) {
//        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[0].getX(), (int)ListeNoeuds[0].getY());
//      } else {
//        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[i+1].getX(), (int)ListeNoeuds[i+1].getY());
//      }
//    }
    
    aff.affichageTailleCheminEtOrderChemin(ListeNoeuds,"origin");

    ListeNoeuds = ch.calculChemin(ListeNoeuds,iterationMutaSelect);
    
    aff.affichageTailleCheminEtOrderChemin(ListeNoeuds,"final");
    
    /**
     * affichage du chemin généré
     */
    g.setColor(Color.RED);
    for(int i = 0;i<ListeNoeuds.length;i++) {
      if(i==ListeNoeuds.length-1) {
        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[0].getX(), (int)ListeNoeuds[0].getY());
      } else {
        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[i+1].getX(), (int)ListeNoeuds[i+1].getY());
      }
    }
  }               
}