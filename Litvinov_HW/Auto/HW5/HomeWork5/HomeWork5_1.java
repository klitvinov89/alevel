package HomeWork5;

public class HomeWork5_1 {

    public static void main(String[] arg) {

        MyInt a1;
        MyInt a2;
        a1 = new MyInt(3);
        a2 = a1;
        System.out.println(a1.x+"x"+" "+a2.x+"x");
        a1 = new MyInt(4);
        a2 = a1;
        System.out.println(a1.x+"x"+" "+a2.x+"x");
    }


}