package HomeWork7;

public class Class1 {
    private String output;

    Class1(){};
    Class1(String output) {
        this.output = output;
    }

    public void setClass1(String output) {
        if (output == null)
            System.out.println("setClass1 wrong value");
        else
            this.output = output;
    }
    public void output(){ System.out.println("Class1 output");
    }
}