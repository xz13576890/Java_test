package Test_OOP_interface;

public class MyClass implements MyInterface{ //执行接口的类必须重写接口的方法


    @Override
    public void test01() {
        String S1 = MyInterface.MAX_GREAD;
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("MyClass.test02");

        return a+b;
    }

}

