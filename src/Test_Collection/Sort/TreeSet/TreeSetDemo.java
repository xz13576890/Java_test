package Test_Collection.Sort.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 提供了解耦方式：业务排序类
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person("小明",100);
        Person p2 = new Person("刘德华",1000);
        Person p3 = new Person("梁朝伟",1200);
        Person p4 = new Person("小李",50);

        //依次存放到TreeSet容器中，使用排序的业务类（匿名内部类）
        TreeSet<Person> persons = new TreeSet<>(
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getHandsome()-o2.getHandsome();
                    }
                }
        );
        persons.add(p1);
        //TreeSet在添加数据时排序
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println(persons);

        //改变数据（原类属性用final修饰并且去除set方法后就无法修改了）
//        p4.setHandsome(100);
//        p4.setName("小明");
        //p4与p1内容重复
        System.out.println(persons);


    }
}
