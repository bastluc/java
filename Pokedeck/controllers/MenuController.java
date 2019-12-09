package controllers;

import views.*;
import controllers.*;

public class MenuController{

    public static void getIndex(){
        Menu.index();
    }
    public static void indexListener(String i){
        switch (i){
            case "1":
                Collection.view();
            break;
            case "2":
                views.Card.add();
            break;
            case "3":
                views.Card.modify();
            break;
            case "4":
                views.Card.remove();
            break;
            case "5":
                models.Card.saveCollection();
                Menu.index();
            break;
            case "6":
            break;
            default:
                Menu.index();
        }
    }
    public static void collectionListener(String i){
        switch (i){
            case "1":
                Menu.index();
            break;
            case "2":
            break;
            default:
                Collection.view();
        }
    }
    public static void cardListener(String i){
        switch (i){
            case "1":
                Menu.index();
            break;
            case "2":
                views.Card.add();
            break;
            case "3":
            break;
            default:
                Collection.view();
        }
    }
    public static void modifyCardListener(String i){
        switch (i){
            case "1":
                Menu.index();
            break;
            case "2":
                views.Card.modify();
            break;
            case "3":

            break;
            default:
                views.Card.modify();
        }
    }
}