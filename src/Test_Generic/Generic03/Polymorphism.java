package Test_Generic.Generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、泛型没有多态
 * 2、泛型没有数组
 */
public class Polymorphism {

    public static void main(String[] args) {
        //多态
        Fruit f = new Apple();
        //泛型则无法使用多态
//        List<Fruit> list = new ArrayList<Apple>();
        List<? extends Fruit> list = new ArrayList<Apple>();

        //普通数组
        Fruit[] arr = new Fruit[10];
        //泛型没有数组
//        Fruit<String>[] arr2 = new Fruit<String>[10];

        //jdk1.7简化后赋值符右边的<>内的泛型可以省略了
        List<Fruit> list2 = new ArrayList<>();

    }
}
