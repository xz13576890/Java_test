package Test_Generic.Generic03;

/**
 * 学生类
 * @param <T>
 */
public class Student<T> {
    private T score;

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }
}
