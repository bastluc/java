import java.util.ArrayList; // import the ArrayList class

public class Monstre{
  private double vie;
  private double argent;
  private ArrayList<Weapon> armes;
  private Weapon currentWeapon;

  public Monstre(){
    this.vie = 100;
    this.argent = 5000;
    armes = new ArrayList<Weapon>();
    if(armes.size() > 0){
      currentWeapon = armes.get(0);
    }
  }

  public double getVie(){
    return this.vie;
  }
  public double getArgent(){
    return this.argent;
  }

  public void acheterArme(Magasin m, int ref){
    if(m.getArmes().get(ref) != null){
      if(this.argent > m.getArmes().get(ref).getPrix()){
        this.armes.add(m.getArmes().get(ref));
        this.payer(m.getArmes().get(ref).getPrix());
      }
    }
  }

  public void changerArmeCourante(int id){
    this.currentWeapon = this.armes.get(id);
  }

  public void addArgent(double argent){
    this.argent += argent;
  }
  public void addVie(double vie){
    this.vie += vie;
  }

  public void payer(double prix){
    this.argent -= prix;
  }

  public void removeVie(double vie){
    this.vie += vie;
  }

  public void frapper(Monstre m){
    m.removeVie(this.currentWeapon.getDegats());
  }
}
