package AffichageDebug;

import Moteur.Lien;
import Moteur.Noeud;

/**
 * 
 * @author Arnaud.VDR
 * @date 24 oct. 2019
 * @project ISEN_Marchant
 * @package AffichageDebug
 *
 */
public class AffDebug {
  
  /**
   * Affichage :
   * 1. de la taille du chemin
   * 2. de l'ordre des Noeuds
   * @param Noeuds
   */
  public void affichageTailleCheminEtOrderChemin(Noeud[] Noeuds, String name) {
    Lien l = new Lien();
    System.out.println("taille " + name + " = " + l.tailleChemin(Noeuds));
    for(int i = 0;i<Noeuds.length;i++) {
      System.out.print(Noeuds[i].getId());
    }
    System.out.println();
  }
}
