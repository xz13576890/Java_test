package Array;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 数组是相同数据类型的有序集合
         * 数组也是对象，数组元素相当于对象的成员变量
         * 数组长度是确定的，不可变的,如果越界则报：ArrayIndexOutofBoundsException
         */
        int[] a = new int[3];
        a[0] = 23;
        a[1] = 28;
        a[2] = 32;
        Car[] cars = new Car[4];
        cars[0] = new Car("Benz");
        cars[1] = new Car("BMW");
        cars[2] = new Car("BYD");

        System.out.println(cars[0].name);
        System.out.println(a.length);

        for (int i = 0 ;i<a.length;i++){ //循环遍历打印数组
            System.out.println(a[i]);
        }


    }
}
