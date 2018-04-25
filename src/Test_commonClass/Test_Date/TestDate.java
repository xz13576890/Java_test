package Test_commonClass.Test_Date;

import java.util.Date;

/**
 * 测试时间类的用法
 */

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();//为空的话默认值是系统当前时间
        long t = System.currentTimeMillis();
        System.out.println(t);
        Date d2 = new Date(1000);
        System.out.println(d2.toGMTString()); //标准纪元的格林尼治时间1000毫秒即1秒后
        System.out.println(d2.getTime());//获得该时间long类型的值

        d2.setTime(5000);//设置对象时间
        System.out.println(d2.getTime());

        System.out.println(d2.before(d));//比较时间大小,在（）前？
        System.out.println(d2.after(d));//比较时间大小,在（）后？




    }

}
