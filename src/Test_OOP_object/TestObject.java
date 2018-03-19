package Test_OOP_object;

public class TestObject {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        System.out.println(obj==obj2);
        System.out.println(obj.equals(obj2));


        Mobile m1 = new Mobile();
        System.out.println(m1.toString());

    }
}
