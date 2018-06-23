package Test_Collection.Set;

import java.util.HashMap;

/**
 * 自定义HashSet
 */
public class MyHashSet {

    HashMap map;
    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PRESENT);//将Map中不可重复的key用作Set中的元素
    }

    public int size(){
        return map.size();
    }

    public static void main(String[] args) {
        MyHashSet s = new MyHashSet();
        s.add("aaa");
        s.add(new String("aaa"));
        System.out.println(s.size());
    }



}
