package HomeWork9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scannerObj;
        double param;
        System.out.println("Figures calculations:");
        System.out.println("____________________________________");
        boolean flagForWhile = true;
        Circle с1 = null;
        while (flagForWhile == true){
            try{
                scannerObj = new Scanner(System.in);
                param = scannerObj.nextDouble();
                с1 = new Circle(param);
                с1.calculate();
                flagForWhile=false;
            }
            catch (InputMismatchException e){
                if(e.getMessage()==null){
                    System.out.println("you write string! Try again");
                }
                else{
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
