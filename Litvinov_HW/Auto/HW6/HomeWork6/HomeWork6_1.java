package HomeWork6;


public class  HomeWork6_1 {

     public static void main(String[] args) {
         String massive[]={"мама","мыла","раму"};
//         System.out.println("1= "+massiveToString1(massive));
         System.out.println("2= "+massiveToString2(massive));
     }

    private static String massiveToString2(String[] massiveForWork) {
        String mess = "";
        for (int i = 0; i < massiveForWork.length; i++) {
            mess = mess.concat(massiveForWork[i]).concat(" ");
        }
        return mess;
    }

//    private static String massiveToString1(String[] massive) {
//         String nnn;
//        StringBuilder bufer = new StringBuilder();
//         for (int i = 0; i < massive.length; i++) {
//             bufer.append(massive[i]).append(" ");
//         }
//         return bufer.toString();

     }




