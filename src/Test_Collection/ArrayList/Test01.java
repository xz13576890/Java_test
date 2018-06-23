package Test_Collection.ArrayList;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

/**
 * 容器基本测试
 */
public class Test01 {

    public static void main(String[] args) {
        List list = new ArrayList();
        //List 是 Collection的子类，ArrayList 是 List 的子类
        //ArrayList 底层实现是通过数组，线程不安全，效率高。所以查询快，修改删除和插入慢
        //linkedList 底层是通过链表实现，线程不安全，效率高。所以查询慢，修改插入删除快
        //Vector 底层也是数组，但线程安全，效率低

        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);//包装类的自动封装，1234被自定封装为Integer类

        System.out.println(list.size());
//        list.remove(new Date()); 由Hashcode和equals来判断是否相等，这里是两个不同的Date对象

        System.out.println(list.size());

        List list2 = new ArrayList();
        list2.add("bbb");
        list2.add("ccc");

        list.add(list2);//注意这里会把list2作为一个数组元素整体加入list，所以只看做增加了一个元素
        System.out.println(list.size());
        System.out.println(list);

        //加入索引操作
        System.out.println(list.get(0));
        list.set(1,"fine!");
        System.out.println(list.get(1));
        list.remove(0);


    }

}

class Dog{

}
