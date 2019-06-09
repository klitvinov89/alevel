package HomeWork8;

public class Rectangle extends Figure implements Calculations{
    private double a, b;
    Rectangle() { }
    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        if (a < 0)
            System.out.println("A wrong value");
        else
            this.a = a;
    }

    public double getA(double a) {
        return a;
    }
    public void setB(double b) {
        if (b < 0)
            System.out.println("B wrong value");
        else
            this.b = b;
    }

    public double getB(double b) {
        return b;
    }

    @Override
    void emptyMethod() {
        System.out.println("Rectangle calculations:");
    }

    @Override
    public void calculate() {
        double lenght;
        lenght = 2 * (a + b);
        System.out.println("Rectangle lenth = " + lenght + " meters");
        double area;
        area = a * b;
        System.out.println("Rectangle area = " + area + " sqr meters");
        System.out.println("____________________________________");
    }

}
