package Test_Collection.Sort.innerType.TreeMap;

import Test_Collection.Sort.TreeSet.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 100);
        Person p2 = new Person("刘德华", 1000);
        Person p3 = new Person("梁朝伟", 1200);
        Person p4 = new Person("小李", 50);

        TreeMap<Person, String> map = new TreeMap<>(
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getHandsome() - o2.getHandsome();
                    }
                });
        map.put(p1, "偶像大师");
        map.put(p2, "偶像大师");
        map.put(p3, "偶像大师");
        map.put(p4, "偶像大师");
        //查看键
        Set<Person> personSet = map.keySet();
        System.out.println(personSet);
    }
}
