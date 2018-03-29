package Test_BasicJava_Concept;

public class Test_Recursion {
    static int a = 0;
    public static void test01(){  //用递归定义了一个循环打印自己10次的方法
        a++;
        System.out.println("test01:"+a);
        if (a<10){  //递归体
            test01();
        }else {     //递归头
            System.out.println("over");
        }
    }

    static long factorial(int n){  //用递归算法定义了一个做“n”的阶乘的方法
        if (n==1){                     //递归头
            return 1;
        }else {
            return n*factorial(n-1);//递归体
        }
    }

    public static void main(String[] args) {
        System.out.println("Test_BasicJava_Concept.Test_Recursion.test01");
        test01();
        System.out.println(factorial(5));


    }
}
