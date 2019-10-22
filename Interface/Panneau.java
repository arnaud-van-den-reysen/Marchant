package Interface;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import Moteur.Chemin;
import Moteur.Graphe;
import Moteur.Noeud;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
    int nb = 10;
    Graphe gr = new Graphe(nb);
    Chemin ch = new Chemin();
    
    ArrayList<Noeud> ListeNoeuds = new ArrayList<Noeud>();
    /**
     * Creation d'une liste tampon
     */
    ListeNoeuds = gr.Noeuds;
    
    for(int i = 0;i<nb;i++) {
      g.fillOval((int)gr.Noeuds.get(i).getX()-5, (int)gr.Noeuds.get(i).getY()-5, 10, 10);
    }
    
    /**
     * Affichage Chemin avant
     */
    g.setColor(Color.GREEN);
    for(int i = 0;i<gr.Noeuds.size();i++) {
      if(i==gr.Noeuds.size()-1) {
        g.drawLine((int)gr.Noeuds.get(i).getX(), (int)gr.Noeuds.get(i).getY(), (int)gr.Noeuds.get(0).getX(), (int)gr.Noeuds.get(0).getY());
      } else {
        g.drawLine((int)gr.Noeuds.get(i).getX(), (int)gr.Noeuds.get(i).getY(), (int)gr.Noeuds.get(i+1).getX(), (int)gr.Noeuds.get(i+1).getY());
      }
    }
    
    /**
     * affichage du chemin généré
     */
    ListeNoeuds = ch.calculChemin(ListeNoeuds);
    
    g.setColor(Color.RED);
    for(int i = 0;i<ListeNoeuds.size();i++) {
      if(i==ListeNoeuds.size()-1) {
        g.drawLine((int)ListeNoeuds.get(i).getX(), (int)ListeNoeuds.get(i).getY(), (int)ListeNoeuds.get(0).getX(), (int)ListeNoeuds.get(0).getY());
      } else {
        g.drawLine((int)ListeNoeuds.get(i).getX(), (int)ListeNoeuds.get(i).getY(), (int)ListeNoeuds.get(i+1).getX(), (int)ListeNoeuds.get(i+1).getY());
      }
    }
  }               
}