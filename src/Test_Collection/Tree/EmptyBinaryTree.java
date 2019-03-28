package Test_Collection.Tree;

/**
 * Empty Binary Tree 空白二叉树
 */
public class EmptyBinaryTree extends BinaryTree {

    static private EmptyBinaryTree emptytree = new EmptyBinaryTree();

    public static EmptyBinaryTree constructEmptyBinaryTree() {
        return emptytree;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean elementOf(int d) {
        return false;
    }

    @Override
    public BinaryTree insert(int data) {
        return new NonEmptyBinaryTree(data);
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
    public String treeshow() {

        return " ";
    }


    @Override
    public BinaryTree remove(int data) {
        return this;
    }

    @Override
    public int balanceFactor() {
        return 0;
    }

    @Override
    public boolean avlBalanced() {
        return true;
    }
}
