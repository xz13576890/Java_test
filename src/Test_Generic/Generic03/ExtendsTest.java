package Test_Generic.Generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * extends：表示泛型的上限 <=，即子类或自身的概念
 * 1、一般用于限制某个操作
 * 2、不能使用再添加数据上，一般都是读取操作
 * 3、规则
 * 合法：
 *  List<Fruit> --> List<? extends Fruit>
 *  List<Apple> --> List<? extends Fruit>
 *  List<? extends Apple> --> List<? extends Fruit>
 *  非法：
 *  List<?> --> List<? extends Fruit>
 *  List<? extends Object > --> List<? extends Fruit>
 */
public class ExtendsTest {

    public static void main(String[] args) {
        //extends 为上限
        Test<Fruit> t1 = new Test<Fruit>();
        Test<Apple> t2 = new Test<Apple>();
        Test<Pear> t3 = new Test<Pear>();

        //规则
        //合法：
        List<? extends Fruit> list1 = new ArrayList<Fruit>();
        test(list1);
        List<Fruit> list2 = new ArrayList<Fruit>();
        test(list2);
        List<Apple> list3 = new ArrayList<Apple>();
        test(list3);

        //? extends Apple
        List<? extends Apple> list4 = new ArrayList<FujiApple>();
        test(list4);
        List<FujiApple> app = new ArrayList<FujiApple>();
        test(app);

        //非法：
        //? -->为什么不行，因为？等同于？extends Object，list5 和 list6是一个意思
        List<?> list5 = new ArrayList<Fruit>();
        List<? extends Object> list6 = new ArrayList<Object>();
//        test(list5);

    }
    //? extends Fruit
    public static void test(List<? extends Fruit> list){
        /* 这里不可以用add添加任何具体的类因为不确定该list属于什么类型
        list.add(new Apple());
        list.add(new FujiApple());
        list.add(new Pear());
        list.add(new Fruit());
        */
        list.add(null);


    }

    //泛型类
    static class Test<T extends Fruit>{}
}
