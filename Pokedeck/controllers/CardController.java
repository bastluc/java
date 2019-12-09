package controllers;

import models.*;
import views.*;
import java.util.ArrayList;

public class CardController{
    public static void add(String name, int hp, String type, Attack[] attacks){
        new PokemonCard(name, hp, type, attacks);
    }
    public static void remove(int choice){
        ArrayList<models.Card> collection = models.Card.getCollection();
        if(choice == -1){
            MenuController.getIndex();
        }
        else {
            if(choice <= collection.size()-1 && choice>=0){
                collection.remove(choice);
                PokemonCard.setCollection(collection);
                System.out.println("La carte a été supprimée ! Votre collection a été enregistrée !");
                models.Card.saveCollection();
                views.Card.remove();
            }
            else {
                System.out.println("Ce numéro de carte n'existe pas !");
                views.Card.remove();
            }
        }
    }
    public static void cardToModify(int id){
        if(id < models.Card.getCollection().size() && id >=0){
            views.Card.modifyCardById(id);
        }
        else {
            System.out.println("Cette carte n'existe pas !");
            views.Card.modify();
        }
    }
    public static void modify(int id, String name, int hp, String type, String attack1name, int attack1strength, String attack2name, int attack2strength){
        Attack[] newAttacks = {new Attack(attack1name, attack1strength), new Attack(attack2name, attack2strength)};
        models.Card newCard = new PokemonCard(name, hp, type, newAttacks);
        models.Card.getCollection().set(id, newCard);
        models.Card.getCollection().remove(models.Card.getCollection().size()-1);
        models.Card.saveCollection();
        System.out.println("Votre collection a été mise à jour !");
    }
}