package Skills;

import java.util.Arrays;

/**
 * char[]数组和字符串的相互转化
 * String.subString()方法的运用
 */
public class charArray_toString {

    public static void main(String[] args) {
        String s ="aeio";
        String placement = "a7A7b6A7c1A3d2A6e2C3f3C2g4A7h6D0i6B0j2B0j1C0k3C0l4B0l5C0";
        char c = s.charAt(0);
        char[] firstLetter = new char[placement.length()];
        char[] f1 ={'a','e','i','o','u'};
        char[] f2 ={'e','i','o','a','u'};
        //用复制法建立的新数组对象不会影响到原数组
        char[] f3 = Arrays.copyOf(f2,f2.length);
        System.out.println(Arrays.equals(f1,f2));
        Arrays.sort(f2);
        System.out.println(Arrays.equals(f1,f2));
        System.out.println(f3);
        System.out.println("###############");

        /* 两种方法将char[]数组转化为字符串*/
        //方法一：直接用数组作为参数构造新字符串
        String s1 = new String(f2);
        System.out.println(s1);

        //方法二：使用String的valueOf方法
        String s2 = String.valueOf(f3);
        System.out.println(s2);

        /* 把字符串转化为char[]数组的方法 */
        char[] f4 = s1.toCharArray();
        System.out.println(f4);

        /*
        把char[]数组转化为带[]的字符串打印的方法
         */
        String s3 = Arrays.toString(f4);
        System.out.println(s3);

        /*
        打印字符串中指定间隔位的字符char
         */
        int count = 0;
        for (int i = 0; i < placement.length(); i += 4) {
            String check = placement.substring(i, i + 4);
            firstLetter[count] = check.charAt(0);
            count++;
        }
        System.out.println(firstLetter);

    }
}



