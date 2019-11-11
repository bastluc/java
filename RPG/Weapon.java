abstract class Weapon{
  private double degats;
  private double prix;

  public Weapon(double degats, double prix){
    this.degats = degats;
    this.prix = prix;
  }

  public double getDegats(){
    return this.degats;
  }

  public double getPrix(){
    return this.prix;
  }

  public abstract String getImage();
}
