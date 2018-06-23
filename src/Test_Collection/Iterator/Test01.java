package Test_Collection.Iterator;

import java.util.*;

/**
 * 迭代器的基础测试
 */
public class Test01 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //通过索引遍历是一种通用手法，适合大多数的容器
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("#####################");
        //通过foreach遍历List
        for (Object s : list){
            System.out.println(s);
        }

        System.out.println("$$$$$$$$$$$$$$");
        //通过迭代器遍历List
        for (Iterator iter2 = list.iterator();iter2.hasNext();) {
            //for(初始化；条件判断；（此处迭代可以省略，因为hasNext()就有迭代的功能））
            String str = (String) iter2.next();
            System.out.println(str);
            iter2.remove();//删除游标左边的元素，遍历后相当于清空了该容器
        }

        //对于Set则无法直接使用索引遍历，需要使用Iterator
        Set s = new HashSet();
        s.add("AAA");
        s.add("BBB");
        s.add("CCC");
        System.out.println(list.size()+"#######################");

        //导入迭代器，用While循环调用迭代方法遍历Set
        Iterator iter = s.iterator();
        while (iter.hasNext()){
            String str = (String)iter.next();
            System.out.println(str);
        }

        System.out.println("########################");

        Set s2 = new HashSet();
        s2.add(111);
        s2.add(222);
        s2.add(333);
        s2.add(444);

        //或者用迭代器并遍历
        for (Iterator iter2 = s2.iterator();iter2.hasNext();){
            //for(初始化；条件判断；（此处迭代可以省略，因为hasNext()就有迭代的功能））
            Integer num = (Integer)iter2.next();
            System.out.println(num);
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        //用foreach也可以遍历Set
        for (Object aS2 : s2) {
            Integer num = (Integer) aS2;
            System.out.println(num);
        }



    }
}
