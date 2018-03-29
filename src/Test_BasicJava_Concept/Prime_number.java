package Test_BasicJava_Concept;

public class Prime_number {
    //输出1-100之间的所有质数
        public static void main(String[] args) {
            int j;
            for (int i = 2; i <= 100; i++) // 1不是素数，所以直接从2开始循环
            {
                j = 2;
                while (i % j != 0) {
                    j++; // 测试2至i的数字是否能被j整除，如不能就自加
                }
                if (j == i) // 当有被整除的数字时，判断它是不是自身
                {
                    System.out.println(i); // 如果是就打印出数字
                }
            }
        }


}
