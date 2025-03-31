package soup2;

import soup2.Potatoe;

public class TestSoup {
    public static void main(String[] args){
        Soup s = new Soup();
        System.out.println(s);

        s.add(new Potatoe(0.3, 10));
        s.add(new Carrot(0.25, 30));
        System.out.println(s);

        s.add(new Potatoe(0.500));
        s.add(new Potatoe(0.150));
        s.add(new Carrot(0.20, 25));
        s.add(new Potatoe(0.450, 2));
        System.out.println(s);

        Soup ss = new Soup();
        ss.add(new Potatoe(0.3, 10));
        ss.add(new Carrot(0.25, 30));
        System.out.println(ss.getPeelingWeight());

        Soup sss = new Soup();
        sss.add(new Potatoe(0.3, 10));
        sss.add(new Carrot(0.25, 30));
        System.out.println(sss.getPeelingWeight());
        Vegetable.setPeelingWeight(0.05);
        System.out.println(sss.getPeelingWeight());
    }
}
