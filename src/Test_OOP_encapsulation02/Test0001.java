package Test_OOP_encapsulation02;

import Test_OOP_encapsulation01.Test01;

public class Test0001 extends Test01{

    public void ttt(){
        super.print();
        print();

    }
    public static void main(String[] args) {
        Test0001 t = new Test0001();
        t.print();
    }
}
