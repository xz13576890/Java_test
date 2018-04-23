package Test_Array.Test_arrayOperation;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] a = new int[6];
        int[] b = {6,3,6,325,77};
        System.arraycopy(b,0,a,0,2); //复制数组
        System.out.println(Arrays.toString(a));//打印数组
        int[] c = {2,4,5,6,7,8,456,234,44};
        Arrays.fill(c,0,2,88);//填充数组
        System.out.println(Arrays.toString(c));
        for (int i : c){ //增强for循环
            System.out.println(i);
        }

    }
}
