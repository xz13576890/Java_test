package Test_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的入门
 * 1、泛型：标签，泛化类型
 * 2、作用：省心，安全
 */
public class Simple {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //安全：类型不对时会有类型检测
//        list.add(1);
        //省心：调用方法时已经能看出是list里的元素是什么类型
        String ele = list.get(0);
        System.out.println(ele);



    }


}
