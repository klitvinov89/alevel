import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_4 {
    public static void main(String[] arg) {
        String[] cities = new String []{"Москва", "Амстердам", "Минск", "Курск", "Киев"};
        System.out.println(Arrays.toString(cities));
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!");
        Scanner scannerObj = new Scanner(System.in);
        String usercity = scannerObj.nextLine();
        System.out.println("Вы назвали город "+usercity);
//        String buf;
        for (int i=0; i<cities.length-1;i++){
            if (cities[i]==usercity){
                cities[i]="null";break;}
                System.out.println(Arrays.toString(cities));
//                    String[] newcities = new String[cities.length-1];
//                        for (int j=0; j<newcities.length-1;j++){
//                            if (newcities[j]!=usercity){
//                                newcities[j]=cities[i];
//                                System.out.println(newcities);
                            }
            }
//        }
//        char a = usercity.toLowerCase().charAt(usercity.length()-1);
//        System.out.println("Значит мне на "+a);
//            for (int k=0; k<cities.length-1;k++){
//                if (cities[k].toLowerCase().charAt(0)==a){
//                    System.out.println("Тогда я называю " +cities[k]);
//                    break;
//                }
            }