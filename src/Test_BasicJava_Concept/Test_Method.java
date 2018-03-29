package Test_BasicJava_Concept;

public class Test_Method {

    public static void outer01(){       //定义一个无形参的方法
        //打印101-150之间的所有质数
        outer:for (int k = 101;k<150;k++){//加上标签“outer”
            for (int m = 2; m < k / 2; m++ ){
                if (k % m == 0){
                    continue outer;//返回标签“outer”
                }
            }
            System.out.print(k + " ");
        }
    }
    public static int sum01(int a,int b){ //定义一个包含形参的方法
        int sum = a + b;
        return  sum;//return 返回值同时结束方法的运行！
    }

    public static void main(String[] args) {
        outer01();//调用一个方法
        int s = sum01(4,5);//调用一个含参数的方法
        System.out.println();
        System.out.println(s);


    }
}
