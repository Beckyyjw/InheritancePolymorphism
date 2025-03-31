package soup1;

public class Potatoe {
    private double poids;
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
        return "Potate : [" + poids + " kg - " + yeux + " yeux]";
    }
}
