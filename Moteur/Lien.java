package Moteur;

import java.util.ArrayList;

/**
 * 
 * @author Arnaud.VDR
 * @date 14 oct. 2019
 * @project Marchant
 * @package Moteur
 *
 */
public class Lien {
  
  /**
   * 
   * @param EntreeNoeuds
   * @return double tailleChemin
   */
  public double tailleChemin(ArrayList<Noeud> EntreeNoeuds) {
    double tailleChemin = -0.f;
    for(int i = 0;i<EntreeNoeuds.size();i++) {
      if(i==EntreeNoeuds.size()-1) {
        tailleChemin+=calculLien(EntreeNoeuds.get(i), EntreeNoeuds.get(0));
      } else {
        tailleChemin+=calculLien(EntreeNoeuds.get(i), EntreeNoeuds.get(i+1));
      }
    }
    return tailleChemin;
  }
  
  /**
   * Calcul distance entre 2 noeuds
   * @param n1
   * @param n2
   * @return
   */
  public double calculLien(Noeud n1,Noeud n2) {
    return Math.sqrt(Math.pow(n1.getX()-n2.getX(), 2)+Math.pow(n1.getY()-n2.getY(), 2));
  }
}
