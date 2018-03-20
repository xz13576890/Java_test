package Test_OOP_interface;

public class Test {
    public static void main(String[] args) {
        Flyable f = new Stone();
        //f.weight = 3; 接口的引用不认字类，只认自己的
        ((Stone) f).weight = 3;//强制转型才能用
    }
}
