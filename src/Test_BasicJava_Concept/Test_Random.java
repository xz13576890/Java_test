package Test_BasicJava_Concept;

import java.util.Random;

public class Test_Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int starter = rand.nextInt(12);//随机产生[0,11]之间的整数
        int junior = starter + 12;
        int expert = junior + 12;
        int master = expert + 12;
        System.out.println(master);

    }
}



