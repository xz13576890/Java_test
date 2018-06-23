package Test_Generic;

/**
 * 自定义泛型
 * 1、<> ——里面写单个字母，尽量见名知意
 * 2、T——Type; K V——Key Value; E——Element
 * 3、泛型不能使用在静态属性上，指定的类型不能为基本类型
 */
//T——type类型
public class MyStudent<T> {

    private T javase;

//    private static T test;静态不能用泛型

    public MyStudent(){

    }
    public MyStudent(T javase) {
        this.javase = javase;
    }

    public T getJavase() {
        return javase;
    }

    public void setJavase(T javase) {
        this.javase = javase;
    }
}
