package HomeWork6;

public class MyArray {
    static String[] mass = {"1st","2nd","3rd","4th","5th",""};
    private static String str = "1";

    public static void main(String[] args) {
//        System.out.println(length(mass));
//        put(str);
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }

    public static int length(String[] mas){
        int count=0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].isEmpty()) {
                count++;
            }
        }
    return count;
    }

    public static void put(String str) {
        String[] newMass = new String[0];
        if (length(mass)!=0){
            for (int i = 0; i < mass.length; i++) {
                if (mass[i].isEmpty()) {
                    mass[i]=str;
                    break;
                }
        }
    }
        else {
       newMass =new String[(mass.length)*2];
            for (int i = 0; i < mass.length; i++) {
                newMass[i]=mass[i];
            }

            for (int i = 0; i <newMass.length; i++) {
                if (newMass[i]==null){
                    newMass[i]=str;
                    break;
                }
            }

        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }

        for (int i = 0; i < newMass.length; i++) {
            System.out.println(newMass[i]);
        }
    }

    public static String get(){
        String[] newMass=new String[mass.length-1];
        String buf = null;

            for (int i = 1; i < mass.length; i++) {
                buf = mass[0];
                newMass[i-1]=mass[i];
            }
            mass= newMass;

        return buf;
    }


}
