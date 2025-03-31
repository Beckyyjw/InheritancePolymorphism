package soup2;

import soup2.Potatoe;
import soup2.Carrot;

public class Soup {
    private static final int  TAILLE = 10;
    private Vegetable[] tab = new Vegetable[TAILLE];
    private int count = 0;

    public Soup(){

    }

    public void add(Vegetable obj){
        if(count < TAILLE){
            tab[count] = obj;
            count ++;
        }else {
            System.out.println("L'inventaire est plein !!");
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Soupe \n").append("------\n");
        if(count == 0){
            sb.append("Il y'a pas d'ingredients dans la soupe \n");
            return sb.toString();
        }else{
            for(int i = 0; i < count; i++){
                sb.append(tab[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public double getPeelingWeight(){
        if(count == 0){
            return 0.0;
        }
        double weight = 0;
        for(int i = 0; i< count; i++){
             weight += tab[i].getPeelingWeight();
        }
        return weight;
    }

}
