package models;

import java.io.Serializable;

public class Attack implements Serializable {
    private String name;
    private int strength;

    public Attack(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }
}