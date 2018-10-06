package Skills;

import java.util.Random;

/**
 * Random & Math.random()
 */
public class Test_Random {
    public static void main(String[] args) {

        /* Random */
        Random rand = new Random();
        //随机产生[0,11]之间的整数
        int starter = rand.nextInt(12);
        int junior = starter + 12;
        int expert = junior + 12;
        int master = expert + 12;
        System.out.println(master);

        /* Math.random() */
        //Randomly pick an element in the array
        int [] arr = {1,2,3,4};

        //Math.random()产生[0，1）的小数
        //产生0-(arr.length-1)的整数值(左闭右开),也是数组的索引
        int index=(int)(Math.random()*arr.length);

        int pick = arr[index];
        System.out.println(pick);
    }
}



