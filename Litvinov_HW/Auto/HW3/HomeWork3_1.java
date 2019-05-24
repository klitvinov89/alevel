import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] arg) {
        //int a, b, c, d;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("enter A value");
        int a = scannerObj.nextInt();
        System.out.println("enter B value");
        int b = scannerObj.nextInt();
        System.out.println("enter C value");
        int c = scannerObj.nextInt();
        System.out.println("Now we try to resolve next equation:"+a+"x^2+"+b+"x+"+c);
        int d = 0;
        System.out.print("D = ");
        System.out.println(d = b * b - 4 * a * c);
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
                int x;
                x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("Can't resolve the equation!");
        }
    }
}
