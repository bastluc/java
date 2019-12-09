package views;

import controllers.*;
import models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Collection{
    public static void view(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Voici votre collection de cartes :");
        ArrayList<models.Card> collection = models.Card.getCollection();
        for(int i=0; i<collection.size(); i++){
            System.out.println(collection.get(i));
        }

        System.out.println("\n");
        System.out.println("1: Retour au menu \n2. Quitter");
        System.out.println("\n\n");
        System.out.println("Veuillez saisir votre choix :");
        String str = sc.next();
        MenuController.collectionListener(str);
    }
}