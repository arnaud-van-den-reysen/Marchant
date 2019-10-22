package Moteur;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Arnaud.VDR
 * @date 22 oct. 2019
 * @project ISEN_Marchant
 * @package Moteur
 *
 */
public class Mutation {
  
  /**
   * ----------- Mutation ------------
   * 1. definition nombre de mutation, aleatoire entre 1 et 20 <br/>
   * 2. une mutation est une permutation entre 2 noeuds <br/>
   * 3. repetition de la permutation selon le nbMutation <br/>
   * @param EntreeNoeuds
   * @return ArrayList<Noeud>
   */
  public ArrayList<Noeud> geneticMutation(ArrayList<Noeud> EntreeNoeuds){
    Random r = new Random();
    int nbMutation = 1+r.nextInt(20);
    Noeud tmpNoeud = new Noeud(0, 0, 0);
    
    for(int i = 0;i<nbMutation;i++) {
      int rand1 = 1+r.nextInt(EntreeNoeuds.size()-1);
      int rand2 = 1+r.nextInt(EntreeNoeuds.size()-1);
      tmpNoeud = EntreeNoeuds.get(rand1);
      EntreeNoeuds.set(rand1, EntreeNoeuds.get(rand2));
      EntreeNoeuds.set(rand2, tmpNoeud);
    }
    return EntreeNoeuds;
  }
}
