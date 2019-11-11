import java.util.ArrayList; // import the ArrayList class

public class Magasin {

  private ArrayList<Weapon> armes; // Create an ArrayList object

  public Magasin(){
    armes = new ArrayList<Weapon>();
  }

  public ArrayList<Weapon> getArmes(){
    return this.armes;
  }
}
