package Interface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Moteur.Lien;
import Moteur.Noeud;
 
@SuppressWarnings("serial")
public class Panneau extends JPanel { 
  Noeud[] listeNoeuds;
  public Panneau(Noeud[] listeNoeuds) {
    this.listeNoeuds = listeNoeuds;
  }

  public void paintComponent(Graphics g){
    Lien l = new Lien();
    
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
    
    for(int i = 0;i<listeNoeuds.length;i++) {
      if(i==0) {
        g.fillOval((int)listeNoeuds[i].getX()-10, (int)listeNoeuds[i].getY()-10, 20, 20);
      } else {
        g.fillOval((int)listeNoeuds[i].getX()-5, (int)listeNoeuds[i].getY()-5, 10, 10);
      }
    }
    
    /**
     * affichage du chemin généré
     */
    g.setColor(Color.RED);
    for(int i = 0;i<listeNoeuds.length;i++) {
      if(i==listeNoeuds.length-1) {
        g.drawLine((int)listeNoeuds[i].getX(), (int)listeNoeuds[i].getY(), (int)listeNoeuds[0].getX(), (int)listeNoeuds[0].getY());
      } else {
        g.drawLine((int)listeNoeuds[i].getX(), (int)listeNoeuds[i].getY(), (int)listeNoeuds[i+1].getX(), (int)listeNoeuds[i+1].getY());
      }
    }
    
    g.drawString("Taille total: " + l.tailleChemin(listeNoeuds), 10, 20);
  }               
}