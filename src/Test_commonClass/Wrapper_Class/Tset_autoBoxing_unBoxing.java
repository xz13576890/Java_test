package Test_commonClass.Wrapper_Class;

/**
 * 测试自动装箱和拆箱
 */
public class Tset_autoBoxing_unBoxing {
    public static void main(String[] args) {
//        Integer a = new Integer(1000);//理论写法
        Integer a = 1000;//实际写法 jdk5.0后编译器会自动增加封装代码:Integer a = new Integer(1000)
        Integer b = 2000;

        int c = b;//jdk5.0后编译器会自动增加拆箱代码:int c = b.intValue();
        System.out.println(c);

        Integer d = 1234;
        Integer d2 = 1234;
        System.out.println(d==d2);//不同对象比较不相等
        System.out.println(d.equals(d2));//不同对象相同值比较则相等

        System.out.println("##################");

        Integer d3 = 123; //[-128,127]之间的数依然会被当作基本数据类型来处理
        Integer d4 = 123;
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));




    }


}
