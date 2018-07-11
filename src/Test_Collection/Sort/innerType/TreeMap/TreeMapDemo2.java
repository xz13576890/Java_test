package Test_Collection.Sort.innerType.TreeMap;

import Test_Collection.Sort.TreeSet.Worker;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        Worker w1 = new Worker("垃圾回收员",12000);
        Worker w2 = new Worker("农民工",8000);
        Worker w3 = new Worker("程序猿",5000);

        TreeMap<Worker,String> employees = new TreeMap<>();
        employees.put(w1,"南京");
        employees.put(w2,"南京");
        employees.put(w3,"南京");
        System.out.println(employees.keySet());
    }
}
