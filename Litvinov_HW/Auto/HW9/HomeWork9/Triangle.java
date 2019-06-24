package HomeWork9;

public class Triangle extends Figure implements Calculations {
    private double a,b,c;
    Triangle() {}
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public void setC(double c) {
        if (c < 0)
            System.out.println("C wrong value");
        else
            this.c = c;
    }

    public double getC(double c) {
        return c;
    }

        @Override
        void emptyMethod() {
            System.out.println("Triangle calculations:");
        }

        @Override
        public void calculate() {
            double lenght;
            lenght = a+b+c;
            System.out.println("Triangle lenth = " + lenght + " meters");
            System.out.println("____________________________________");

        }

    }

