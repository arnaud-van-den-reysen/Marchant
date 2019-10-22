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
public class Chemin {
  
  /**
   * 
   * @param gr
   * @return
   */
  public ArrayList<Noeud> calculChemin(ArrayList<Noeud> EntreeNoeuds) {
    Mutation m = new Mutation();
    Selection s = new Selection();
    Lien l = new Lien();
    
    ArrayList<Noeud> tmpNoeuds = new ArrayList<Noeud>();
    /**
     * Creation d'une liste tampon
     */    
    for(int i = 0;i<EntreeNoeuds.size();i++) {
      Noeud n = new Noeud(0,0,0);
      tmpNoeuds.add(n);
    }
    
//    System.out.println("taille NON = " + l.tailleChemin(tmpNoeuds));
//    for(int i = 0;i<tmpNoeuds.size();i++) {
//      System.out.print(tmpNoeuds.get(i).getId());
//    }
//    System.out.println();
    
    for(int i = 0;i<EntreeNoeuds.size();i++) {
      tmpNoeuds.get(i).setIdXY(EntreeNoeuds.get(i).getId(), EntreeNoeuds.get(i).getX(), EntreeNoeuds.get(i).getY());
    }
    
//    System.out.println("taille EntreeNoeuds = " + l.tailleChemin(EntreeNoeuds));
//    for(int i = 0;i<EntreeNoeuds.size();i++) {
//      System.out.print(EntreeNoeuds.get(i).getId());
//    }
//    System.out.println();
    
//    System.out.println("taille tmpNoeuds = " + l.tailleChemin(tmpNoeuds));
//    for(int i = 0;i<tmpNoeuds.size();i++) {
//      System.out.print(tmpNoeuds.get(i).getId());
//    }
//    System.out.println();
//    
    /**
     * 1000 MutationSelection
     */
    for(int i = 0; i<10;i++) {
      
      System.out.println("##########################");
      System.out.println("taille EntreeNoeuds = " + l.tailleChemin(EntreeNoeuds));
      for(int j = 0;j<EntreeNoeuds.size();j++) {
        System.out.print(EntreeNoeuds.get(j).getId());
      }
      System.out.println();
      
      System.out.println("taille tmpNoeuds = " + l.tailleChemin(tmpNoeuds));
      for(int j = 0;j<tmpNoeuds.size();j++) {
        System.out.print(tmpNoeuds.get(j).getId());
      }
      System.out.println();
  
      tmpNoeuds = m.geneticMutation(tmpNoeuds);
      
      System.out.println("taille EntreeNoeuds = " + l.tailleChemin(EntreeNoeuds));
      for(int j = 0;j<EntreeNoeuds.size();j++) {
        System.out.print(EntreeNoeuds.get(j).getId());
      }
      System.out.println();
      
      System.out.println("taille tmpNoeuds = " + l.tailleChemin(tmpNoeuds));
      for(int j = 0;j<tmpNoeuds.size();j++) {
        System.out.print(tmpNoeuds.get(j).getId());
      }
      System.out.println();
      
      
      tmpNoeuds = s.geneticSelection(EntreeNoeuds, tmpNoeuds);
      
      System.out.println("taille EntreeNoeuds = " + l.tailleChemin(EntreeNoeuds));
      for(int j = 0;j<EntreeNoeuds.size();j++) {
        System.out.print(EntreeNoeuds.get(j).getId());
      }
      System.out.println();
      
      System.out.println("taille tmpNoeuds = " + l.tailleChemin(tmpNoeuds));
      for(int j = 0;j<tmpNoeuds.size();j++) {
        System.out.print(tmpNoeuds.get(j).getId());
      }
      System.out.println();
    }

    return tmpNoeuds;
  }
}
