package Test_BasicJava_Concept;

public class Test_break_continue {
    public static void main(String[] args) {
        //生成0-100的随机数，直到生成88为止，停止循环
        int total = 0;
        System.out.println("Begin");
        while (true) {
            total++;
            int i = (int) Math.round(100 * Math.random());//Math.round()为四舍五入取整方法,返回类型为long
            if (i == 88) {
                break;
            }
        }
        System.out.println("Game over, used " + total + " times.");
        System.out.println("#############################");

        //把100-150之间不能被3整除的数输出
        for (int j = 100; j < 150; j++) {
            if (j % 3 == 0) {
                continue;//能被3整除时跳过循环不打印j
            }
            System.out.println(j);
        }
        System.out.println("***************************");
        //带标签的break和continue类似goto活用技巧:打印101-150之间的所有质数
        outer:for (int k = 101;k<150;k++){//加上标签“outer”
            for (int m = 2; m < k / 2; m++ ){
                if (k % m == 0){
                    continue outer;//返回标签“outer”
                }
            }
            System.out.print(k + " ");
        }




    }
}
