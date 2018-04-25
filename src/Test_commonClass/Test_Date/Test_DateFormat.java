package Test_commonClass.Test_Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_DateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");//规定日期显示格式:y年 M月 d日,大小写意思不同，详见API文档
        DateFormat df2 = new SimpleDateFormat("yy年MM月dd日,属于本年的第w周");// w属于本年的第几周/W属于本月底第几周
        DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//h时(12h)/H(24h) m分 s秒

        Date d = new Date(1231231232L);//建立一个时间对象

        String str = df.format(d);//将时间对象转为设定格式的字符串
        String str2 = df2.format(d);
        String str3 = df3.format(d);
        String str4 = df4.format(d);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("################");
        String str5 = "1977-7-7 10:23:15";
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//格式必须和目标数据对应
        try {
            Date d2 = df5.parse(str5);//解析目标字符串,该方法要求增加异常检测
            System.out.println(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
