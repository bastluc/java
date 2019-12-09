package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class Card implements Serializable{
    //Different types of Cards
    private  static  final  long serialVersionUID =  1350092881346723535L;
    private static String[] types = {
        "Acier",
        "Combat",
        "Dragon",
        "Eau",
        "Electrik",
        "Fée",
        "Feu",
        "Glace",
        "Insecte",
        "Normal",
        "Plante",
        "Poison",
        "Psy",
        "Roche",
        "Sol",
        "Spectre",
        "Ténèbres",
        "Vol"
    };

    protected int id;
    protected String type;
    protected String name;

    //collection of cards
    protected static ArrayList<Card> collection = new ArrayList<Card>();

    public Card(String type, String name){
        this.id = 0;
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static String[] getTypes() {
        return types;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Card> getCollection() {
        return collection;
    }

    public static void setCollection(ArrayList<Card> newCollection) {
        collection = newCollection;
    }

    public static void saveCollection(){
        try {
            FileOutputStream fs = new FileOutputStream("collection.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            for(int i=0; i<collection.size(); i++){
                os.writeObject(collection);
            }
            os.close();
         } catch (Exception e) { 
            e.printStackTrace(); 
         }
    }
    
    @SuppressWarnings("unchecked")
    public static void getSavedCollection(){
        ArrayList<Card> savedCollection = null;
        try {
            FileInputStream fis = new FileInputStream("collection.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            savedCollection = (ArrayList<Card>)ois.readObject(); // 4
            collection = savedCollection;
            ois.close();
         } catch (Exception e) { 
            e.printStackTrace(); 
         }
    }
}