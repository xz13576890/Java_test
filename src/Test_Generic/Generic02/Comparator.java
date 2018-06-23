package Test_Generic.Generic02;

/**
 * 泛型接口与泛型父类 同理
 */
//接口只包含公共抽象的方法和全局常量
public interface Comparator<T> {
    //全局常量
    public static final int MAX_VALUE = 100;

    //公共抽象方法
    public abstract void test(T t);
}

//实现
class InterC1 implements Comparator{
    @Override
    public void test(Object o) {

    }
}
class InterC2 implements Comparator<Integer>{
    @Override
    public void test(Integer integer) {

    }
}
class InterC3<T,A> implements Comparator<T>{
    @Override
    public void test(T t) {

    }
}
