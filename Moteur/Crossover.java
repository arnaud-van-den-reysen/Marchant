package Moteur;

/**
 * 
 * @author Arnaud.VDR
 * @date 5 déc. 2019
 * @project ISEN_Marchant
 * @package Moteur
 *
 */
public class Crossover {
  
  /**
   * Mélange deux individus, prend la première moitié du premier individu,
   * puis la deuxième moitié sur second, sauf si le point existe déjà dans le nouvel individu,
   * alors prend le point du premier individu.
   * @param paths
   * @return Noeud[]
   */
  public Noeud[] geneticCrossover(Noeud[][] paths) {
    int taille = paths[0].length;
    boolean exist = false;
    Noeud[] newPath = new Noeud[taille];
    
    for(int i=0;i<taille;i++) {
      if(i<taille/2) {
        newPath[i] = paths[0][i];
      } else {
        int cmp = 0;
        for(int j=0;j<taille;j++) {
          if(paths[1][i] != newPath[j]) {
            cmp++;
          } else {
            exist = false;
          }
        }
        if(cmp == taille) {
          exist = true;
        }
        if(exist) {
          newPath[i] = paths[1][i];
        } else {
          newPath[i] = paths[0][i];
        }
      }
    }
    return newPath;
  }
}
