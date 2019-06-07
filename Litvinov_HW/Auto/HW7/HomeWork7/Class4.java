package HomeWork7;

public class Class4 extends Class1{
    private int x;

    public Class4 (String output, int x){
        super(output);
        this.x=x;
    }
    @Override
    public void output(){
        System.out.println("Class4 output");
    }
}
