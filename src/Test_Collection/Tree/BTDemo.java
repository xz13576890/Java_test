package Test_Collection.Tree;

/**
 * Binary Tree 二叉树Demo
 */
public class BTDemo {

    public static void main(String[] args) {
        BT bt = new EBT();
        System.out.println("start : " + bt.show() + " size " + bt.size());
        bt = bt.insert(5);
        bt = bt.insert(7);
        bt = bt.insert(2);
        bt = bt.insert(20);
        bt = bt.insert(5);
        System.out.println("start : " + bt.show() + " size " + bt.size());
        System.out.println("is 7 in ? " + bt.elementOf(7));
        System.out.println("is 7 in ? " + bt.elementOf(21));
        bt = bt.remove(5);
        System.out.println(" : " + bt.show() + " size " + bt.size());
        System.out.println("is 5 in ? " + bt.elementOf(5));




    }
}
