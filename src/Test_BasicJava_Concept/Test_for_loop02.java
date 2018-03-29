package Test_BasicJava_Concept;//打印九九乘法表

public class Test_for_loop02 {
    public static void main(String[] args) {
        //先分解为打印其中一行
        for (int i = 1;i<=3;i++){
            System.out.print(i + "*3=" + (i*3) + "\t");//打印出第三行
        }

        System.out.println("\n"+"#######################");

        //找出规律把1-9连续打印成一行
        for (int j=1;j<=9;j++){
            for (int k=1;k<=j;k++){
                System.out.print(k + "*" + j + "=" + (j*k) + "\t");
            }
            System.out.println();//把换行加上
        }

    }
}
