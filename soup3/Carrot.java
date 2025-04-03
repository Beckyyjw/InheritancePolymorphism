package soup3;

public class Carrot extends Vegetable {
    private static final int CALORIES_PER_KG = 400;
    private int longueur;

    public Carrot(double poids) {
        this.poids = poids;
    }

    public Carrot(double poids, int longueur) {
        this.poids = poids;
        this.longueur = longueur;
    }

    @Override
    public int getCalories() {
        double poidsNet = getPoidsNet();
        return (int) (poidsNet * CALORIES_PER_KG);
    }

    public double getPoidsNet() {
        return poids * (1 - peelingWeight);  // Poids net après avoir enlevé 10% pour l'épluchage
    }

    @Override
    public String toString() {
        return "Carotte : [" + this.getCalories() + " calories - " + poids + " kg - " + longueur + " cm]";
    }
}
