package Test_Collection.Map;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private Date date;


    @Override
    public boolean equals(Object o) {
        //重写的equals方法，默认是比较两个对象是否为同一个对象，重写后添加了Map中适用的id相等即相同等自定义内容
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        //封装了一个散列算法
        return Objects.hash(id);
    }

}
