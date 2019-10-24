package Moteur;

import AffichageDebug.AffDebug;

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
  public Noeud[] calculChemin(Noeud[] EntreeNoeuds, int iterationMutaSelect) {
    Mutation m = new Mutation();
    Selection s = new Selection();
    AffDebug aff = new AffDebug();
    
    Noeud[] tmpNoeuds = new Noeud[EntreeNoeuds.length];
    /**
     * Creation d'une liste tampon
     */    
    
//    aff.affichageTailleCheminEtOrderChemin(EntreeNoeuds,"Chemin");

    for(int i = 0;i<EntreeNoeuds.length;i++) {
      tmpNoeuds[i] = EntreeNoeuds[i];
    }
    
//    aff.affichageTailleCheminEtOrderChemin(EntreeNoeuds,"Chemin");
//    
//    aff.affichageTailleCheminEtOrderChemin(tmpNoeuds,"Chemin");

    /**
     * 1000 MutationSelection
     */
    for(int i = 0; i<iterationMutaSelect;i++) {
      
//      System.out.println("##########################");
//      
//      aff.affichageTailleCheminEtOrderChemin(EntreeNoeuds,"Chemin");
//      
//      aff.affichageTailleCheminEtOrderChemin(tmpNoeuds,"Chemin");
  
      tmpNoeuds = m.geneticMutation(tmpNoeuds);
      
//      aff.affichageTailleCheminEtOrderChemin(EntreeNoeuds,"Chemin");
//      
//      aff.affichageTailleCheminEtOrderChemin(tmpNoeuds,"Chemin");

      tmpNoeuds = s.geneticSelection(EntreeNoeuds, tmpNoeuds);
      
      for(int j = 0;j<EntreeNoeuds.length;j++) {
        EntreeNoeuds[j] = tmpNoeuds[j];
      }
      
//      aff.affichageTailleCheminEtOrderChemin(EntreeNoeuds,"Chemin");
//      
//      aff.affichageTailleCheminEtOrderChemin(tmpNoeuds,"Chemin");
      
    }

    return tmpNoeuds;
  }
}
