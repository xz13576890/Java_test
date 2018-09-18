package Skills;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符是否互为置换的算法
 * 1、数组排序法
 * 2、数组下标计算法：
 * 开辟一个整型数组作为计算空间，使用该空间计算第一个字符串中每个字母的出现次数（类似计数字典，但是无需导入Map），出现一次，
 * 该字符的值就自加一次；然后再遍历第二个字符串，同样的字符出现一次就自减一次，如果最后该空间中每个元素均回归0，则两组字符串
 * 互为置换。
 * 每个字符的ASCII码值作为对应数组下标，例如'a'是97，在第一个字符串中出现了2次，则space[97]=2，第二个字符串中'a'也出现了2次，
 * 则space[97]=0。
 */
public class Permutation {

    public static boolean isPermute01(String a, String b) {
        //数组排序法
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (c1.length != c2.length) {
            return false;
        } else {
            return Arrays.equals(c1, c2);
        }

    }

    public static boolean isPermute02(String a, String b) {
        //数组下标计算法
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        if (c1.length != c2.length) {
            return false;
        }
        int[] space = new int[256];
        for (int i = 0; i < c1.length; i++) {
            space[c1[i]]++;
        }
        //两种for循环写法均可
        for (char c : c2) {
            space[c]--;
        }
        for (int i : space) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str1 = input.next();
//        String str2 = input.next();
        //构造两个较大的字符串比较
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i =0;i<1000000;i++){
            s1.append("iutopewuighvkd");
        }
        for (int i =0;i<1000000;i++){
            s2.append("potopewvsswvkd");
        }
        String str1 = s1.toString();
        String str2 = s2.toString();

        long t1 = System.currentTimeMillis();
        System.out.println(isPermute01(str1, str2));
        long t2 = System.currentTimeMillis();
        System.out.println("数组排序法用时：" + (t2 - t1));
        long t3 = System.currentTimeMillis();
        System.out.println(isPermute02(str1,str2));
        long t4 = System.currentTimeMillis();
        System.out.println("数组下标法用时：" + (t4 - t3));


    }
}
