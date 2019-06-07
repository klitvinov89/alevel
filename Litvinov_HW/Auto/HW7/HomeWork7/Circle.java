package HomeWork7;

public class Circle {
    private double radius;
    private final double PI = 3.14;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius) {
        if (radius<0)
            System.out.println("X wrong value");
        else
            this.radius = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

    public void getPerimeter(){
        double lenght;
        lenght = 2*PI*radius;
        System.out.println("Circle lenth = "+ lenght+" meters");

    }

}
