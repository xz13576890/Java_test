package Test_commonClass.Test_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 */
public class VisualCalender {
    public static void main(String[] args) {
        System.out.println("请输入日期（按照格式：2001-3-13）：");
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
//        String temp = "2018-4-27";//临时选取时间字符串
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//根据选取字符串规定格式
        try {
            Date d = format.parse(temp);//将选取字符串用规定格式读取并转化为Date类对象（使用该功能要检测异常）
            Calendar c = new GregorianCalendar();
            c.setTime(d);//将Date转化为Calender
            int selectDay = c.get(Calendar.DATE);//将输入的日期中的那天记录下来后面好标记

            c.set(Calendar.DATE,1);//将给定字符串的日期初始化为1号便于日历摆放

//            System.out.println(c.get(Calendar.DAY_OF_WEEK));//获得1号属于星期几，记住周日是1，那么4是周三
            int weekDay = c.get(Calendar.DAY_OF_WEEK);
//            System.out.println(c.getActualMaximum(Calendar.DATE));//获得该月份的最大天数
            int maxDate = c.getActualMaximum(Calendar.DATE);

            System.out.println("日\t一\t二\t三\t四\t五\t六");//‘\t’是tab制表符的意思

            for (int i = 1; i <= maxDate + weekDay - 1; i++){ //实际怎么实现打印效果，多试几次会发现规律
                if (i - (weekDay - 1) == selectDay){ //将输入的日期做标记
                    System.out.print("*");
                }
                if (i <= weekDay - 1){
                    System.out.print("\t");
                }
                if (i > weekDay - 1) {
                    System.out.print(i - (weekDay - 1) + "\t");
                    if (i % 7 == 0) {
                        System.out.println();
                    }
                }
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}
