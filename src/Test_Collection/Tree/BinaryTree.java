package Test_Collection.Tree;

/**
 * Binary Tree 二叉树抽象类
 */
public abstract class BinaryTree {

    public abstract int size();

    public abstract boolean elementOf(int d);

    public abstract BinaryTree insert(int d);

    public abstract String show();

    public abstract boolean isEmpty();

    // print the tree using an ascii drawing
    public abstract String treeshow();

    public abstract int height();

    public abstract Integer biggest();

    public abstract BinaryTree remove(int d);

    public abstract int balanceFactor();

    public abstract boolean avlBalanced();


}
