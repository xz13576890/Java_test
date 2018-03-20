package Test_OOP_interface;

public interface MyInterface {
    //接口中只有常量和抽象方法
    /*public static final （默认属性都是常量,写不写都一样）*/ String MAX_GREAD = "BOSS";
    int MAX_SPEED = 120;

    /*public abstract（默认修饰符都是公开抽象 */ void test01();
    /*public abstract*/ int test02(int a,int b);


}
