package HomeWork7;

public class HomeWork7_2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0.1);
        Circle circle2 = new Circle(0.25);
//        Circle circle3 = new Circle();
        Circle[] circles = {circle1,circle2,};
        for (int i = 0; i < circles.length; i++) {
            circles[i].getPerimeter();
        }
    }
}
