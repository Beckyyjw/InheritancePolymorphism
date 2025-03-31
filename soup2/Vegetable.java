package soup2;

public class Vegetable {
    protected double poids;
    protected static double peelingWeight = 0.1;

    public double getPeelingWeight(){
        return poids * peelingWeight;
    }

    public static void setPeelingWeight(double peelingWeight){
        Vegetable.peelingWeight = peelingWeight;
    }

}
