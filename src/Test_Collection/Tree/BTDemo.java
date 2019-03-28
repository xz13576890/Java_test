package Test_Collection.Tree;

/**
 * Binary Tree 二叉树Demo
 * 创建一个不可变二叉树代表一个集合{5，7，2，20}
 */
public class BTDemo {

    public static void main(String[] args) {
        BinaryTree bt = new EmptyBinaryTree();
        System.out.println("start : " + bt.show() + " size " + bt.size());
        bt = bt.insert(5);
        bt = bt.insert(7);
        bt = bt.insert(2);
        bt = bt.insert(20);
        bt = bt.insert(5);
        System.out.println(bt.height());
        System.out.println("start : " + bt.show() + " size " + bt.size());
        System.out.println("is 7 in ? " + bt.elementOf(7));
        System.out.println("is 7 in ? " + bt.elementOf(21));
        bt = bt.remove(5);
        System.out.println(" : " + bt.show() + " size " + bt.size());
        System.out.println("is 5 in ? " + bt.elementOf(5));




    }
}
