package soup2;

public class Carrot extends Vegetable{

    private int longueur;

    public Carrot(){}
    public Carrot(double poids, int longueur){
        this.poids = poids;
        this.longueur = longueur;
    }

    @Override
    public String toString(){
        return "Carotte : [" + poids + " kg - " + longueur + " cm]";
    }
}
