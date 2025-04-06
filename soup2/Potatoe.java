package soup2;

public class Potatoe extends Vegetable{
    private int yeux;

    public Potatoe(){}
    public Potatoe(double poids, int yeux){
        this.poids = poids;
        this.yeux = yeux;
    }
    public Potatoe(double poids){
        this.poids = poids;
        this.yeux = (int) (poids * 10);
    }

    @Override
    public String toString(){
        return "Patate : [" + poids + " kg - " + yeux + (yeux == 1 ? " oeil" : " yeux") + "]";
    }

    @Override
    public double getPeelingWeight(){
        return super.getPeelingWeight() + 0.01 * yeux;
    }
}
