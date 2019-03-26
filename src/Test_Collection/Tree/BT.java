package Test_Collection.Tree;

/**
 * Binary Tree 抽象类
 */
public abstract class BT {
    public abstract int size();

    public abstract boolean elementOf(int d);

    public abstract BT insert(int d);

    public abstract String show();

    public abstract boolean isEmpty();

    public abstract int height();

    public abstract Integer biggest();

    public abstract BT remove(int d);


}
