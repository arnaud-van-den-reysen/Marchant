package Moteur;

import java.util.ArrayList;

/**
 * 
 * @author Arnaud.VDR
 * @date 1 oct. 2019
 * @project Marchant
 * @package Moteur
 *
 */
public class Graphe {
  /**
   * liste de Noeuds
   */
  public ArrayList<Noeud> Noeuds = new ArrayList<Noeud>();
  
  /**
   * 
   * @param nb
   */
  public Graphe(int nb) {
    this.Noeuds=generationNoeud(nb);
  }
  
  /**
   * generation des noeuds
   * @param nb
   * @return listeNoeuds
   */
  private ArrayList<Noeud> generationNoeud(int nb) {
    ArrayList<Noeud> Noeuds = new ArrayList<Noeud>();
    for(int i = 0;i<nb;i++) {
      Noeud n = new Noeud(i,Math.random()*400,Math.random()*500);
      Noeuds.add(n);
    }
    return Noeuds;
  }
}
