package HomeWork7;

public class HomeWork7_1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1("Class1");
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4("Class4", 666);
        Class1[] classes = {class1, class2, class3, class4};
        for (int i = 0; i < classes.length; i++) {
            classes[i].output();
        }
    }
}