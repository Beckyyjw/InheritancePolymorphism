package soup3;

public class Vegetable implements Quantifiable{
    protected double poids;
    protected int calories;
    protected static double peelingWeight = 0.1;

    public double getPeelingWeight(){
        return poids * peelingWeight;
    }

    public static void setPeelingWeight(double peelingWeight){
        Vegetable.peelingWeight = peelingWeight;
    }

    @Override
    public int getCalories(){
        return calories;
    }
}
