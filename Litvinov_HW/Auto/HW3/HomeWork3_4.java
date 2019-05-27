import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_4 {
    public static void main(String[] arg) throws IOException {
        Scanner scannerObj;
        String userCity;
        String empty = "null";
        boolean flagForWhile = true;
        boolean firstCircle= true;
        char firstChar = 0;
        char lastChar = 0;
        char a ;
        String[] cities = {"Москва", "Амстердам", "Минск", "Курск", "Киев"};
        System.out.println(Arrays.toString(cities));
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!");

        while(flagForWhile==true) {
            if(firstCircle==false){
                scannerObj = new Scanner(System.in);
                userCity = scannerObj.nextLine();
                firstChar = userCity.toLowerCase().charAt(0);
                if(firstChar==lastChar){
                    a = userCity.toLowerCase().charAt(userCity.length() - 1);
                    System.out.println("Вы назвали город " + userCity);
                    for (int i = 0; i < cities.length; i++) {
                        if (cities[i].toLowerCase().equals(userCity.toLowerCase())) {
                            cities[i]=empty;
                        }
                    }
                    System.out.println("Значит мне на " + a);
                    for (int k = 0; k < cities.length; k++) {
                        if (cities[k].toLowerCase().charAt(0) == a) {
                            System.out.println("Тогда я называю " + cities[k]);
                            lastChar = cities[k].toLowerCase().charAt(cities[k].length()-1);
                            System.out.println("Значит тебе на " + lastChar);
                            cities[k]=empty;
                            flagForWhile=true;
                            break;
                        } else {
                            flagForWhile=false;
                        }
                    }
                    firstCircle = false;
                }
                else{
                    System.out.println("Вы назвали город не на ту букву!");
                    flagForWhile=true;
                }
            }
            else {
                scannerObj = new Scanner(System.in);
                userCity = scannerObj.nextLine();
                a = userCity.toLowerCase().charAt(userCity.length() - 1);
                System.out.println("Вы назвали город " + userCity);

                for (int i = 0; i < cities.length; i++) {
                    if (cities[i].toLowerCase().equals(userCity.toLowerCase())) {
                        cities[i]=empty;
                    }
                }

                System.out.println("Значит мне на " + a);
                for (int k = 0; k < cities.length; k++) {
                    if (cities[k].toLowerCase().charAt(0) == a) {
                        System.out.println("Тогда я называю " + cities[k]);
                        lastChar = cities[k].toLowerCase().charAt(cities[k].length()-1);
                        System.out.println("Значит тебе на " + lastChar);
                        cities[k]=empty;
                        flagForWhile=true;
                        break;
                    }
                    else {
                        flagForWhile=false;
                    }
                }
                firstCircle = false;
            }
        }

        System.out.println("Я проиграл, вы знаете больше городов!");
    }
}