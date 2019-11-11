import java.util.Scanner;

public class GameController {

  public static void menu(){
    System.out.println("\n________________________________\n 1. Voir mes armes \n________________________________");
    System.out.println("\n________________________________\n 2. Acheter une arme \n________________________________");
    System.out.println("\n________________________________\n 3. Frapper un monstre \n________________________________");
    System.out.println("\n________________________________\n 4. Quitter le jeu \n________________________________\n\n\n");
    System.out.println("Veuillez saisir votre choix (chiffre de 1 à 4) :");
    Scanner choice = new Scanner(System.in);
    int userChoice = choice.nextInt();
    
  }


  public static void main(String[] args){
    Monstre playersMonstre = new Monstre();

    menu();
  }
}
