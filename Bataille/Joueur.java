import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Joueur{
  private List<Carte> cartes;
  private int score;

  public Joueur(){
    this.cartes = new ArrayList<>();
    this.score = 0;
  }

  public String toString(){
    String string = "ce joueur a "+this.score+" points \n";
    string += "Il possede "+cartes.size()+" cartes : \n";
    for (var i=0; i<cartes.size(); i++){
      string += i+" : "+cartes.get(i)+"\n";
    }
    return string;
  }

  public void setCartes(List<Carte> cartes){
    this.cartes = cartes;
  }
  public void winParty(){
    this.score++;
  }

  public List<Carte> getCartes(){
    return this.cartes;
  }
  public int getScore(){
    return this.score;
  }
}
