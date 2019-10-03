import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Bataille{
  public static void main(String[] args){
    Play();
  }

  public static void Play(){
    List<Carte> paquet = getPaquet();
    Joueur joueur1 = new Joueur();
    Joueur joueur2 = new Joueur();
    Collections.shuffle(paquet);

    for (var i=0; i<26; i++){
      joueur1.getCartes().add(paquet.get(i));
    }
    for (var i=26; i<52; i++){
      joueur2.getCartes().add(paquet.get(i));
    }

    while(joueur1.getCartes().size() > 0 && joueur2.getCartes().size() > 0){
      if(joueur1.getCartes().get(0).getValeur() > joueur2.getCartes().get(0).getValeur()){
        System.out.println("\n\n\n"+joueur1.getCartes().get(0)+" .vs. "+joueur2.getCartes().get(0));
        joueur1.getCartes().add(joueur1.getCartes().get(0));
        joueur1.getCartes().remove(0);
        joueur1.getCartes().add(joueur2.getCartes().get(0));
        joueur2.getCartes().remove(0);
        joueur1.winParty();
        System.out.println("joueur 1 gagne la manche !");
      }
      else if(joueur2.getCartes().get(0).getValeur() == joueur1.getCartes().get(0).getValeur()){
        System.out.println("\n\n\n"+joueur1.getCartes().get(0)+" .vs. "+joueur2.getCartes().get(0));
        joueur1.getCartes().add(joueur1.getCartes().get(0));
        joueur1.getCartes().remove(0);
        joueur1.getCartes().add(joueur2.getCartes().get(0));
        joueur2.getCartes().remove(0);
        System.out.println("Egalité !");
      }
      else if(joueur2.getCartes().get(0).getValeur() > joueur1.getCartes().get(0).getValeur()) {
        System.out.println("\n\n\n"+joueur1.getCartes().get(0)+" .vs. "+joueur2.getCartes().get(0));
        joueur2.getCartes().add(joueur2.getCartes().get(0));
        joueur2.getCartes().remove(0);
        joueur2.getCartes().add(joueur1.getCartes().get(0));
        joueur1.getCartes().remove(0);
        joueur2.winParty();
        System.out.println("joueur 2 gagne la manche !");
      }
    }
    System.out.println("\n\n________________________________________________________\n\n");
    System.out.println("\n\n Le joueur 1 possède "+joueur1.getCartes().size()+" cartes, le joueur 2 en possède "+joueur2.getCartes().size()+"\n\n");
    if(joueur1.getCartes().size() == 0){
      System.out.println("JOUEUR 2 GAGNE ! ");
    }
    else {
      System.out.println("JOUEUR 1 GAGNE ! ");
    }
    System.out.println("Résultat : "+joueur1.getScore()+" à "+joueur2.getScore()+"\n\n\n");
  }

  public static List<Carte> getPaquet(){
    List<Carte> paquet = new ArrayList();
    for(var i=0; i<4; i++){
      for(var y=0; y<13; y++){
        paquet.add(new Carte(y, i));
      }
    }
    return paquet;
  }
}
