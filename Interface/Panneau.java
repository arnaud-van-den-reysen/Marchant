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
    int iterationMutaSelect = 1000000;
    Graphe gr = new Graphe();
    Chemin ch = new Chemin();
    AffDebug aff = new AffDebug();
    
    Noeud[] ListeNoeuds = new Noeud[nb];
    ListeNoeuds = gr.generationNoeud(nb);
    
    for(int i = 0;i<nb;i++) {
      g.fillOval((int)ListeNoeuds[i].getX()-5, (int)ListeNoeuds[i].getY()-5, 10, 10);
    }
    
    /**
     * Affichage Chemin avant
     */
    g.setColor(Color.GREEN);
    for(int i = 0;i<ListeNoeuds.length;i++) {
      if(i==ListeNoeuds.length-1) {
        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[0].getX(), (int)ListeNoeuds[0].getY());
      } else {
        g.drawLine((int)ListeNoeuds[i].getX(), (int)ListeNoeuds[i].getY(), (int)ListeNoeuds[i+1].getX(), (int)ListeNoeuds[i+1].getY());
      }
    }
    
    aff.affichageTailleCheminEtOrderChemin(ListeNoeuds,"origin");
    
    /**
     * affichage du chemin généré
     */
    ListeNoeuds = ch.calculChemin(ListeNoeuds,iterationMutaSelect);
    
    aff.affichageTailleCheminEtOrderChemin(ListeNoeuds,"final");
    
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