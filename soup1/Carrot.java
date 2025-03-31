package soup1;

public class Carrot {
    private double poids;
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
