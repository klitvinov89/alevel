package HomeWork8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Figures calculations:");
        System.out.println("____________________________________");
        Circle c1 = new Circle(1.1);
        Triangle t1 = new Triangle(1.1,2,3);
        Rectangle r1 = new Rectangle(2,5);
        Figure [] figs = {c1,t1,r1};
        for (int i = 0; i < figs.length; i++) {
            figs[i].calculate();
        }
//        c1.calculate();
//        t1.calculate();
//        r1.calculate();
    }
}
