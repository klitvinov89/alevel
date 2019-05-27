import java.util.Scanner;
import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] arg) {
        int x = 3;
        int y = 4;
        System.out.println(x + y);
//        System.out.print(x);
//        System.out.print(y);
        System.out.println(x + "" + y);
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(Integer.toBinaryString(-1));
        // prints "11111111111111111111111111111111"
        System.out.println(Integer.toBinaryString(-1 >> 16));
        // prints "11111111111111111111111111111111"
        System.out.println(Integer.toBinaryString(-1 >>> 16));
        // prints "1111111111111111"

        int i1 = 5;
        i1 = i1++;
        System.out.println(i1); //5
        int i2 = 5;
        i2 = i2++ + i2++;
        System.out.println(i2); //10
        int i3 = 5;
        i3 = i3++ + ++i3;
        System.out.println(i3); //11
        int i4 = 5;
        i4 = ++i4 + ++i4;
        System.out.println(i4); //12

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Введите предложение");
        String userText = scannerObj.nextLine();
//        System.out.println(userText);
        String[] words = userText.split("\\s");
//        System.out.println(words);
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
