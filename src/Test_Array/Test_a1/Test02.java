package Test_Array.Test_a1;

/**
 * 数组的基本语法
 */
public class Test02 {
    public static void main(String[] args) {
        //声明:[]可以放在类后也可放在变量后
        int[] a;
        int b[];
        //创建数组对象
        a = new int[4];
        b = new int[5];

        //初始化(对数组元素的初始化）
        //默认初始化：数组元素相当于对象的成员变量，默认值规则一样）
        //动态初始化：
        for (int i = 0;i<a.length;i++){
            a[i] = i * 12;
        }
        System.out.println(a[3]);

        //静态初始化：
        int c[] = {23,43,56,78};//长度4，索引范围0~3
        Car[] cars = {new Car("奔驰"),new Car("比亚迪"),new Car("宝马")};
        Car c2 = new Car("奔驰");
        System.out.println(c2 == cars[0]);//两者不是同一个对象
    }
}
