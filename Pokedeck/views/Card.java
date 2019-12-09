package views;

import controllers.*;
import models.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Card {
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Nom de votre Pokemon :");
        String name = sc.next();
        System.out.println("Nombre de hp de votre Pokemon (entier) :");
        int hp = sc.nextInt();
        System.out.println("Choisissez un type parmis les suivants :\n");
        String[] types = models.PokemonCard.getTypes();
        for(int i = 0; i<types.length; i++){
            System.out.println(i+1+" : "+types[i]);
        }
        System.out.println("\n Votre choix :");
        String type = types[sc.nextInt()];
        System.out.println("Passons maintenant aux attaques :\n");
        System.out.println("Nom de la première attaque du pokemon :");
        String attack1name = sc.next();
        System.out.println("Dégats de la première attaque du Pokemon :");
        int attack1strength = sc.nextInt();
        System.out.println("Nom de la deuxième attaque du pokemon :");
        String attack2name = sc.next();
        System.out.println("Dégats de la deuxième attaque du Pokemon :");
        int attack2strength = sc.nextInt();

        Attack[] attacks = {new Attack(attack1name, attack1strength), new Attack(attack2name, attack2strength)};
        CardController.add(name, hp, type, attacks);
        System.out.println("\n\n Votre Pokemon vient d'être ajouté ! Votre collection a été enregistrée !");
        models.Card.saveCollection();

        System.out.println("\n\n1: Retour au menu \n2. Ajouter une nouvelle carte \n3. Quitter");
        System.out.println("\n\n");
        System.out.println("Veuillez saisir votre choix :");
        String str = sc.next();
        MenuController.cardListener(str);
    }

    public static void remove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        
        ArrayList<models.Card> collection = models.Card.getCollection();
        for(int i=0; i<collection.size(); i++){
            System.out.println("\nCarte "+i+" :");
            System.out.println(collection.get(i));
        }

        System.out.println("Veuillez saisir le numéro de la carte à supprimer (entrez -1 pour retourner au menu) :");
        int choice = sc.nextInt();
        CardController.remove(choice);
    }

    public static void modify(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        
        ArrayList<models.Card> collection = models.Card.getCollection();
        for(int i=0; i<collection.size(); i++){
            System.out.println("\nCarte "+i+" :");
            System.out.println(collection.get(i));
        }

        System.out.println("Veuillez saisir le numéro de la carte à modifier (entrez -1 pour retourner au menu) :");
        int choice = sc.nextInt();
        CardController.cardToModify(choice);
    }
    public static void modifyCardById(int id){
        Scanner sc = new Scanner(System.in);
        models.Card card = models.Card.getCollection().get(id);
        System.out.println("Vous allez modifier la carte suivante : ");
        System.out.println(card);
        System.out.println("\n\n");
        System.out.println("nouveau Nom de votre Pokemon (ancien : "+card.getName()+") : ");
        String name = sc.next();
        System.out.println("nouveau Nombre de hp de votre Pokemon (entier) :");
        int hp = sc.nextInt();
        System.out.println("Choisissez un type parmis les suivants :\n");
        String[] types = models.PokemonCard.getTypes();
        for(int i = 0; i<types.length; i++){
            System.out.println(i+1+" : "+types[i]);
        }
        System.out.println("\n Votre choix :");
        String type = types[sc.nextInt()];
        System.out.println("Passons maintenant aux attaques :\n");
        System.out.println("Nom de la première attaque du pokemon :");
        String attack1name = sc.next();
        System.out.println("Dégats de la première attaque du Pokemon :");
        int attack1strength = sc.nextInt();
        System.out.println("Nom de la deuxième attaque du pokemon :");
        String attack2name = sc.next();
        System.out.println("Dégats de la deuxième attaque du Pokemon :");
        int attack2strength = sc.nextInt();

        CardController.modify(id, name, hp, type, attack1name, attack1strength, attack2name, attack2strength);

        System.out.println("\n\n1: Retour au menu \n2. Modifier une autre carte \n3. Quitter");
        System.out.println("\n\n");
        System.out.println("Veuillez saisir votre choix :");
        String str = sc.next();
        MenuController.cardListener(str);
    }
}