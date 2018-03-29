package Test_BasicJava_Concept;

public class Test_for_loop01 {
    public static void main(String[] args) {
        //分别输出0-100之间奇数和偶数的和
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0;i<=100;i++){
            if (i%2!=0){
            sum_odd = sum_odd + i;
            }else{
                sum_even = sum_even + i;
            }
        }
        System.out.println("奇数的和为："+ sum_odd);
        System.out.println("偶数的和为："+ sum_even);
        System.out.println("############################");

        //输出1-1000之间能被5整除的数，每行3个
        for (int j = 1;j <= 1000;j++){
            if(j % 5 == 0){
                System.out.print(j+" "); //先输1-1000之间出所有能被5整除的数并排成一排
            }
            if (j%15==0){     //观察出每逢（5*3=15）的倍数可以换行
                System.out.println();
            }
        }

    }

}
