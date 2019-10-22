package Moteur;

import java.util.ArrayList;

/**
 * 
 * @author Arnaud.VDR
 * @date 22 oct. 2019
 * @project ISEN_Marchant
 * @package Moteur
 *
 */
public class Selection {
  
  /**
   * ------------ Selection ------------ <br/>
   * 1. Si la nouvelle liste a une distance plus petite <br/>
   * 2. return NouveauChemin <br/>
   * @param AncienNoeuds
   * @param NouveauNoeuds
   * @return ArrayList<Noeud>
   */
  public ArrayList<Noeud> geneticSelection(ArrayList<Noeud> AncienNoeuds,ArrayList<Noeud> NouveauNoeuds) {
    Lien l = new Lien();
    double tailleAncienChemin = l.tailleChemin(AncienNoeuds);
    System.out.println("taille AncienNoeuds = " + l.tailleChemin(AncienNoeuds));
    for(int i = 0;i<AncienNoeuds.size();i++) {
      System.out.print(AncienNoeuds.get(i).getId());
    }
    System.out.println();
    
    double tailleNouveauChemin = l.tailleChemin(NouveauNoeuds);
    System.out.println("taille NouveauNoeuds = " + l.tailleChemin(NouveauNoeuds));
    for(int i = 0;i<NouveauNoeuds.size();i++) {
      System.out.print(NouveauNoeuds.get(i).getId());
    }
    System.out.println();
    
    System.out.print("------- passage : ");
    if(tailleNouveauChemin < tailleAncienChemin) {
      System.out.println("IF");
      return NouveauNoeuds;
    }
    System.out.println("ELSE");
    return AncienNoeuds;
  }
}
