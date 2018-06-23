package Test_Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestEquals {

    public static void main(String[] args) {
        List list = new ArrayList();
        String s1 = "aaa";
        String s2 = "aaa";
        list.add(s1);
        list.add(s2);
        System.out.println(list.size());

        Map map = new HashMap();
        //Map中键不能重复，判断的标准是调用equals()方法,两个键内容一样即算重复，哪怕你是不同的对象
        map.put(s1,"AAA");
        map.put(s2,"BBB");
        System.out.println(map.get("aaa"));

    }
}
