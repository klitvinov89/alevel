package HomeWork9;

public class Circle extends Figure implements Calculations {
    private double radius;
    private String radiusStrring;
    private final double PI = 3.14;

    Circle() { }
    Circle(double radius) throws Exception{
        this.radius = radius;
        if (radius <= 0){
            throw new Exception(radius +" invalid value of Radius" );
        }
    }

    public void setRadius(double radius) {
        if (radius < 0)
            System.out.println("X wrong value");
        else
            this.radius = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }


    @Override
    void emptyMethod() {
        System.out.println("empty Method");
    }

    @Override
    public void calculate() {
        double lenght;
        lenght = 2 * PI * radius;
        System.out.println("Circle lenth = " + lenght + " meters");
        double area;
        area = PI * radius * radius;
        System.out.println("Circle area = " + area + " sqr meters");
        System.out.println("____________________________________");
    }

}