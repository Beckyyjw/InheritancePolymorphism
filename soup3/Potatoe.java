package soup3;

public class Potatoe extends Vegetable {
    private int yeux;
    private static final int CALORIES_PER_KG = 800; // 80 calories pour 100g = 800 pour 1kg
    private static final int CALORIES_PER_YEUX = 5; // -5 calories par germe

    public Potatoe(double poids, int yeux) {
        this.poids = poids;
        this.yeux = yeux;
    }

    @Override
    public int getCalories() {
        double poidsNet = getPoidsNet(); // Poids après épluchage
        return (int) (poidsNet * CALORIES_PER_KG - CALORIES_PER_YEUX * yeux);
    }

    public double getPoidsNet() {
        return poids * (1 - peelingWeight); // Retirer 10% du poids pour l'épluchage
    }

    @Override
    public String toString() {
        return "Patate : [" + this.getCalories() + " calories - " + poids + " kg - " + yeux + (yeux == 1 ? " oeil" : " yeux") + "]";
    }
}
