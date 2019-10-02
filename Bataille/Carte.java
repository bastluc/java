import java.util.Arrays;
import java.util.List;

public class Carte{
  private static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
  private static String[] couleurs = {"coeur", "carreau", "pique", "trefle"};
  private int couleur;
  private int valeur;

  public Carte(int valeur, int couleur){
    this.couleur = 0;
    this.valeur = 0;
    if(Carte.isARealCard(couleur, valeur)){
      this.couleur = couleur;
      this.valeur = valeur;
    }
  }

  private static boolean isARealCard(int c, int v){
    return true;
  }

  public String toString(){
    return(valeurs[this.valeur]+" de "+couleurs[this.couleur]);
  }

  public int getCouleur(){
    return this.couleur;
  }
  public int getValeur(){
    return this.valeur;
  }
  public String getStringValeur(){
    return valeurs[this.valeur];
  }
  public String getStringCouleur(){
    return couleurs[this.couleur];
  }
  public boolean isBetterAs(Carte c){
    if (this.valeur > c.valeur){
      return true;
    }
    else {
      return false;
    }
  }

  private static int findIndex(String[] arr, int t)
  {
      return Arrays.asList(arr).indexOf(t);
  }
}
