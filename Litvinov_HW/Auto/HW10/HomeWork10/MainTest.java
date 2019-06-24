package HomeWork10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {

    @Anat
    public void soutMethod1() {
        System.out.println("Write Something1");
    }

    public void soutMethod2() {
        System.out.println("Write Something2");
    }

    public void soutMethod3() {
        System.out.println("Write Something3");
    }


    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        Class class1 = MainTest.class;
        Method[] methods = class1.getMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(Anat.class)) {
                try {
                    methods[i].invoke(mainTest);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}




