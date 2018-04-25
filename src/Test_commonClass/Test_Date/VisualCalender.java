package Test_commonClass.Test_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历程序
 */
public class VisualCalender {
    public static void main(String[] args) {
        String temp = "2030-5-10";//临时选取时间字符串
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//根据选取字符串规定格式
        try {
            Date d = format.parse(temp);//将选取字符串用规定格式读取并转化为Date类对象（使用该功能要检测异常）
            Calendar c = new GregorianCalendar();
            c.setTime(d);//将Date转化为Calender

            c.set(Calendar.DATE,1);//将给定字符串的日期初始化为1号便于日历摆放

//            System.out.println(c.get(Calendar.DAY_OF_WEEK));//获得1号属于星期几，记住周日是1，那么4是周三
            int weekDay = c.get(Calendar.DAY_OF_WEEK);
//            System.out.println(c.getActualMaximum(Calendar.DATE));//获得该月份的最大天数
            int maxDate = c.getActualMaximum(Calendar.DATE);

            System.out.println("日\t一\t二\t三\t四\t五\t六");//‘\t’是tab制表符的意思


            for (int i = 1; i <= maxDate; i++){
                if (i <= 3){
                    System.out.print("\t");
                }
                if (i > 3) {
                    System.out.print(i + "\t");
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
