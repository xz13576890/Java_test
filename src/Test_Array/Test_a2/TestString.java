package Test_Array.Test_a2;

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



    }

}
