package Test_Collection.Tree;

/**
 * Empty Binary Tree 空白二叉树
 */
public class EBT extends BT{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean elementOf(int d) {
        return false;
    }

    @Override
    public BT insert(int d) {
        return new NEBT(d);
    }

    @Override
    public String show() {
        return "";
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int height() {
        return -1;
    }

    @Override
    public Integer biggest() {
        return null;
    }

    @Override
    public BT remove(int d) {
        return this;
    }
}
