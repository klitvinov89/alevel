
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] arg) throws IOException {
//        Scanner scannerObj = new Scanner(System.in);
//        System.out.println("enter massive of value using spaces");
//        int a = scannerObj.nextInt();
//        System.out.println(a);
//        String [] intArr = a.split(" ");
//        System.out.println(Arrays.toString(intArr));
//        String massive = Arrays.toString(intArr);
//
        System.out.println("enter massive of value using spaces");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] s = reader.readLine().split("\\s");
        int []intArr= new int[s.length];
        for(int k =0;k<s.length;k++){
            intArr[k]= Integer.parseInt(s[k]);
        }
        int buf;
        for (int i = 0; i < intArr.length-1; i++) {
            if(intArr[i] > intArr[i+1]){

                buf = intArr[i];
                intArr[i] = intArr[i+1];
                intArr[i+1] = buf;
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        System.out.println("min = " +intArr[0]);
        System.out.println("max = " +intArr[intArr.length-1]);
    }
}
