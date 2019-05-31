package HomeWork5;

public class HomeWork5_2 {

    public static void main(String[] arg) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(4, 2);
        Point massive[] = {point1, point2, point3, point4};
        for (int i = 0; i < massive.length; i++) {
            massive[i].info();}
        System.out.println("---------------------------------");
        for (int i1 = 0; i1 < massive.length; i1++)
            {if (massive[i1].x%2==0 & massive[i1].y%2==0)
                massive[i1].info();}

            }

        }




