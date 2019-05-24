import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_3 {
    public static void main(String[] arg) {
        String poem = "Роняет лес багряный свой убор,\n" +
                "Сребрит мороз увянувшее поле,\n" +
                "Проглянет день как будто поневоле\n" +
                "И скроется за край окружных гор.";
        System.out.println(poem);
        char[] poemmassive = poem.toCharArray();
        System.out.println(poemmassive);
        int count = 0;
        char o = 'о';
        for (int i=0; i <poem.length();i++) {
                if (poem.charAt(i)==o) {
                    count++;
                }
            }
        System.out.println("counter = "+ count);
    }
}