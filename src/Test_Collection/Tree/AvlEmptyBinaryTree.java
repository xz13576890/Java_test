package Test_Collection.Tree;

/**
 * 空白Avl二叉树
 */
public class AvlEmptyBinaryTree extends EmptyBinaryTree{
    static private EmptyBinaryTree avlemptytree = new AvlEmptyBinaryTree();

    public static EmptyBinaryTree constructEmptyBinaryTree(){
        return avlemptytree;
    }
    public BinaryTree insert(int data){
        return new AvlEmptyBinaryTree();
    }
}
