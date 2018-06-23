package Test_Generic.Generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * super：表示泛型的下限 >=，即父类或自身的概念
 * 1、一般用于上限操作
 * 2、能够添加子类或自身数据，不能添加父对象
 * 3、规则
 * 合法：
 *  List<Fruit> --> List<? super Apple>
 *  List<Apple> --> List<? super Apple>
 *  List<? super Fruit> --> List<? super Apple>
 *  非法：
 *  List<? super FujiApple> --> List<? super Apple>
 */
public class SuperTest {

    public static void main(String[] args) {
        //>= 即父类或自身
        List<Apple> list1 = new ArrayList<Apple>();
        test(list1);
        List<Fruit> list2 = new ArrayList<Fruit>();
        test(list2);
        List<Object> list3 = new ArrayList<Object>();
        test(list3);

        //规则
        //合法：
        List<? super Apple> list4 = new ArrayList<Apple>();
        test(list4);
        List<? super Fruit> list5 = new ArrayList<Object>();
        test(list5);
        //非法：
        //因为FujiApple < Apple
        List<? super FujiApple> list6 = new ArrayList<Object>();
//        test(list6);
        //因为？等同于？extends Object，有可能 < Apple
        List<?> list7 = new ArrayList<Object>();
//        test(list7);

    }

    public static void test(List<? super Apple> list){
        //不能添加父类对象，可以添加子类对象
        list.add(new Apple());
        list.add(new FujiApple());
        //因为Apple的父类一定包含Apple的子类，但不一定包含Apple的其他父类
//        list.add(new Fruit());
    }
}
