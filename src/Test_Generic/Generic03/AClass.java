package Test_Generic.Generic03;

/**
 * 班级A 类
 * @param <T>
 */
public class AClass<T> {
    //属性：学生
    private T stu;

    public T getStu() {
        return stu;
    }

    public void setStu(T stu) {
        this.stu = stu;
    }
}
