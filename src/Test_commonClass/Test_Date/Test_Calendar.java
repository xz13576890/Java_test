package Test_commonClass.Test_Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日历类
 */
public class Test_Calendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();
        c.set(2018,Calendar.JANUARY,10,13,23,34);//可以一次性设置全日期
        c2.set(Calendar.YEAR,2001); //也可以单独设置某个日期的域,这里只设置年和月
        c2.set(Calendar.MONTH,Calendar.MAY);

        Date d = c.getTime();
        Date d2 = c2.getTime();
        System.out.println(d);
        System.out.println(d2);//未设置的日和时分秒会自动用当前的日和时分秒填充！
        System.out.println(c.get(Calendar.YEAR));//获得指定Calender对象的指定日期域

        c.setTime(new Date());//把当前系统时间作为Date对象传给Calender
        System.out.println(c.getTime());

        //测试日期计算
        c2.add(Calendar.YEAR,30);//增加30年
        c2.add(Calendar.MONTH,2);//增加两月
        c2.add(Calendar.DATE,-15);//减少15天
        System.out.println(c2.getTime());




    }
}
