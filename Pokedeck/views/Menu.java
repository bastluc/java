package views;

import controllers.*;
import models.*;
import java.util.Scanner;

public class Menu{

    public static void index(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n1. Voir ma Collection \n2. Ajouter une carte \n3. Modifier une carte \n4. Supprimer une carte \n5. Sauvegarder ma Collection \n6. Quitter \n\n");
        System.out.println("Veuillez saisir votre choix :");
        String str = sc.next();
        MenuController.indexListener(str);
    }
}