package Test_BasicJava_Concept;

public class Test_While_loop {
    public static void main(String[] args) {
        int a = 1;
        while (a<=20){
            System.out.println(a);
            a++;
        }
        System.out.println("while循环结束！");//按列打印从1-20的整数

        //计算1+2+3+4+……+100的值
        int b = 1;
        int sum = 0;
        while (b<=100){
            sum = sum + b;
            b++;
        }
        System.out.println("和为："+sum);

    }
}
