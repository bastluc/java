package models;

public class PokemonCard extends Card {
    private int hp;
    private String type;
    private Attack[] attacks = new Attack[2];

    public PokemonCard(String name, int hp, String type, Attack[] attacks) {
        super("pokemon", name);
        this.hp = hp;
        this.type = type;
        this.attacks = attacks;
        collection.add(this);
        this.id = collection.size()-1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attack[] getAttacks() {
        return attacks;
    }

    @Override
    public String toString() {
        return "----------------------------\n" +
                name + " | " + hp + " hp |\n" +
                attacks[0].getName() + " | " + attacks[0].getStrength() + " |\n" +
                attacks[1].getName() + " | " + attacks[1].getStrength() + " |\n" +
                "----------------------------";
    }
}