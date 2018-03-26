package Test_Array.Test_stringbuilder;

/**
 * 测试StringBuilder的一些常用方法
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.delete(3,5);//删除从字符串索引第三至第五的字符，[3,5)，左闭区间，右开区间，所以实际只删除了第3和第4
        System.out.println(sb);

        sb.reverse();//逆序输出原字符串
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();




    }
}
