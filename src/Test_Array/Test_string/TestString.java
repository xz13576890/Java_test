package Test_Array.Test_string;

/**
 * String 称为不可变字符序列
 */

public class TestString {
    public static void main(String[] args) {

        String str = new String("abcd");
        String str2 = new String("abcd");
        System.out.println(str.charAt(2));
        System.out.println(str2.equals(str)); //比较内容是否相等
        System.out.println(str2 == str);//在堆里新建了两个不同的String对象，所以是不等的

        String str3 = "decef";
        String str4 = "decef";
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);//没有新建对象，直接纸箱常量池里的相同值所以相等

        System.out.println(str3.indexOf('e'));//返回字符串中指定字符的序号

        String s = str3.substring(1);//返回字符串中指定序号之后的所有剩余字符串
        System.out.println(s);

        String str5 = str3.replace('e','*');//替换原字符串中的指定字符为新字符
        System.out.println(str5);
        System.out.println();

        String str6 = "abcde,rrtt,cccee";
        String[] strArray = str6.split("rr"); //将原字符串用指定的字符切割后组成一个新的数组
        for (int i = 0 ; i < strArray.length; i++){//循环遍历打印该数组
            System.out.println(strArray[i]);
        }

        String str7 = "  aa  bb  ";
        String str77 = str7.trim();//去除字符串中[首尾]的所有空格
        System.out.println(str77.length());

        System.out.println("Abc".equalsIgnoreCase("abc"));//无视大小写比较两个字符串的值

        System.out.println("Abcbd".indexOf('b'));//返回从左往右第一个指定字符的序号
        System.out.println("Abcbd".lastIndexOf('b'));//返回从右往左第一个指定字符的序号

        System.out.println("Abcbd".startsWith("Ab"));//检测是否以指定的字符串开头
        System.out.println("Abcbd".endsWith("bd"));//检测是否以指定的字符串结尾

        System.out.println("Abcbd".toLowerCase());//将原字符串全部转为小写
        System.out.println("Abcbd".toUpperCase());//将原字符串全部转为大写

        System.out.println("####################");
        String gg = "b";//这一步只出来一个对象，即常量池里的“b"
        String gh = new String("a");//这一步执行完出来两个对象，常量池里的“a"一个，new出来另一个值用的”a”
        for (int i = 0; i < 3 ; i++){
            gh += i;//常见的拼字符串代码，任何用“+”连接的两侧只要有一个是String类则系统会把另一个也转为String再拼接
        }
        System.out.println(gh);






    }

}
