package Moteur;

/**
 * 
 * @author Arnaud.VDR
 * @date 30 sept. 2019
 * @project Marchant
 * @package Moteur
 *
 */
public class Noeud {
  /**
   * Identifiant du noeud
   */
  private int id;
  /**
   * position en X du noeud
   */
  private double x;
  /**
   * position en Y du noeud
   */
  private double y;
  
  public Noeud(int id, double x, double y) {
    this.id=id;
    this.x=x;
    this.y=y;
  }

  public int getId() {
    return id;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Noeud [id=" + id + ", x=" + x + ", y=" + y + "]";
  }
  
}
