package Test_Generic;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 非泛型类中定义泛型方法
 * 定义：在返回类型之前加上<字母>
 */
public class Method {

    //打印随便什么类型T的方法，爽歪歪
    public static <T> void test(T t){
        System.out.println(t);
    }

    public static <T extends List> void test(T t){ //泛型T后加extends表示是后面类的实现类，可以看作其子类
        System.out.println(t);
        t.add("aaa");
    }

    //释放资源使用
    public static <T extends Closeable> void test(T...a){ //...表示可变参数，可以是任意结构的参数，常量，数组都行
        for (T temp:a){
            try{
                if (null!=temp){
                    temp.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        test("今天天气不错！");
        test(12345);
        test(new Date().getTime());

        test(new FileInputStream("a.txt"));


    }
}
