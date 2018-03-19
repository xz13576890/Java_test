package Test_OOP_encapsulation01;

public class Test01 {
    private String str;
    protected void print(){
        System.out.println("Test01.print()");
    }

}

class Test001 extends Test01{
    public void pp() {
        print();
    }
}
