package Test_Generic;

/**
 * 泛型接口
 * @param <T>
 */
public interface Comparator<T> {
    //接口中的常量默认为全局常量
    /*public static final*/ int MAX_VALUE = 1024;
    //T不能做全局常量
//    T STR = "AAAA";

    //公共的抽象方法
    void compare(T t);
}
