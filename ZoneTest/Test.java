package ZoneTest;

import Moteur.Chemin;
import Moteur.Graphe;
import Moteur.Lien;

/**
 * 
 * @author Arnaud.VDR
 * @date 22 oct. 2019
 * @project ISEN_Marchant
 * @package ZoneTest
 *
 */
public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int nbNoeuds = 10;
    Graphe gr = new Graphe(nbNoeuds);
    Lien l = new Lien();
    Chemin ch = new Chemin();
    
    System.out.println("taille origine = " + l.tailleChemin(gr.Noeuds));
    for(int i = 0;i<gr.Noeuds.size();i++) {
      System.out.print(gr.Noeuds.get(i).getId());
    }
    System.out.println();
    
    gr.Noeuds = ch.calculChemin(gr.Noeuds);
    
    System.out.println("taille finale = " + l.tailleChemin(gr.Noeuds));
    for(int i = 0;i<gr.Noeuds.size();i++) {
      System.out.print(gr.Noeuds.get(i).getId());
    }
    System.out.println();
  }

}
