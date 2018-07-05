package Test_Collection.Sort.innerType;

import java.util.Date;

/**
 * 内置引用数据类型（常用）比较
 */
public class Demo01 {

    public static void main(String[] args) {
        Integer a; //根据基本数据类型比较大小
        Character ch; //According to Unicode order
        String str = "afa"; //如果其中一个是另外一个起始开始的子串，返回长度之差
        String str2 = "abcd123";//否则返回第一个不相等的Unicode码之差
        System.out.println(str.compareTo(str2));
        str2 = "aadsfsdhashguishi";
        System.out.println(str.compareTo(str2));

        Date date; // 根据日期的长整型比较


    }
}
