package Test_Generic.Generic02;

/**
 * 泛型父类
 * 子类继承时有两种情况：
 * 1、保留泛型（泛型子类）：a、全部保留 b、部分保留；
 * 2、不保留泛型（按需实现子类）：a、指定具体类型 b、没有类型（擦除Object）
 * 子类重写方法的类型随父类而定
 */
public abstract class Father<T1,T2> {
    T1 age;
    public abstract void test(T2 name);
}
//1a：全部保留
class C1<T1,T2> extends Father<T1,T2>{

    @Override
    public void test(T2 name) {
        //this.age -->T1
    }
}
//1b：部分保留
class C2<T2> extends Father<Integer,T2>{

    @Override
    public void test(T2 name) {
        //this.age --> Integer
    }
}
//2a：指定具体类型
class C3 extends Father<Integer,String>{
    @Override
    public void test(String name) {
        //this.age --> Integer
    }
}
//2b:不指定类型，相当于写成<Object,Object>
class C4 extends Father{
    @Override
    public void test(Object name) {
        //this.age --> Object
    }
}