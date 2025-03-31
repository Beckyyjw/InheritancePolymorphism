package soup1;

public class TestCarrot {
    public static void main(String [] args){
        Carrot c = new Carrot(0.25, 30);
        System.out.println(c);

        Potatoe pdt1 = new Potatoe(0.3, 10);
        Potatoe pdt2 = new Potatoe(0.3);
        Potatoe pdt3 = new Potatoe(0.75);
        System.out.println(pdt1);
        System.out.println(pdt2);
        System.out.println(pdt3);

    }

}
