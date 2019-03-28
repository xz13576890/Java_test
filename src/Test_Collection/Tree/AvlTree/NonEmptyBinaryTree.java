package Test_Collection.Tree.AvlTree;

/**
 * Not empty binary tree(immutable) 非空二叉树(不可变型）
 */
public class NonEmptyBinaryTree extends BinaryTree {
    int data;
    BinaryTree left, right;


    public NonEmptyBinaryTree(int data) {
        this.data = data;
        left = new EmptyBinaryTree();
        right = new EmptyBinaryTree();
    }

    public NonEmptyBinaryTree(int data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public int size() {
        return 1 + left.size() + right.size();
    }

    @Override
    public boolean elementOf(int d) {
        if (d == data) {
            return true;
        } else if (d < data) {
            return left.elementOf(d);
        } else { //d > data
            return right.elementOf(d);
        }

    }

    /**
     * 不可变型树插入新值只能重建一个新树
     *
     * @param d
     * @return
     */
    @Override
    public BinaryTree insert(int d) {
        if (d == data) {
            return this;
        } else if (d < data) {
            return new NonEmptyBinaryTree(data, left.insert(d), right);
        } else { //d > data
            return new NonEmptyBinaryTree(data, left, right.insert(d));
        }

    }

    @Override
    public String show() {
        //广度优先显示，从左至右
//        return left.show() + " " + data + " " + right.show();

        //把root单独拿出来显示
        return data + "(" + left.show() + " , " + right.show() + ")";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int height() {
        return 1 + Math.max(left.height(), right.height());
    }

    @Override
    public Integer biggest() {
        if (right instanceof EmptyBinaryTree) {
            return data;
        } else {
            return right.biggest();
        }
    }

    @Override
    public String treeshow() {
        if (left.isEmpty() && right.isEmpty()) return " " + data + " ";
        String stl = left.treeshow();
        String str = right.treeshow();
        String stal[] = stl.split("\n");
        String star[] = str.split("\n");
        int lenl = stal[0].length();
        int lenr = star[0].length();
        StringBuffer res = new StringBuffer();
        String strdata = data + "";
        int fullsize = lenl + strdata.length() + lenr;


        res.append(repeat(" ", (lenl)) + strdata + repeat(" ", lenr) + "\n");
        int lcentre = (left.isEmpty() ? 0 : centre(stal[0]));
        int rcentre = (right.isEmpty() ? 0 : centre(star[0]));

        res.append(repeat(" ", lcentre) + "+" + repeat("-", lenl - lcentre - 1) + "+" + repeat("-", rcentre - 1 + strdata.length()) + "+" + repeat(" ", lenr - rcentre - 1) + "\n");
        res.append(repeat(" ", lcentre) + (left.isEmpty() ? " " : "|") + repeat(" ", lenl - lcentre - 1) + repeat(" ", rcentre + strdata.length()) + (right.isEmpty() ? " " : "|") + repeat(" ", lenr - rcentre - 1) + "\n");

        for (int i = 0; i < Math.max(stal.length, star.length); i++) {
            res.append((i < stal.length ? stal[i] : repeat(" ", lenl)) + repeat(" ", strdata.length()) + (i < star.length ? star[i] : repeat(" ", lenr)) + "\n");
        }
        return res.toString();
    }

    protected int centre(String string) {
        int i = 0;
        while (i < string.length() && string.charAt(i) == ' ') i++;
        return i;
    }

    protected String repeat(String string, int n) {
        String res = "";
        for (int i = 0; i < n; i++) res += string;
        return res;
    }


    @Override
    public BinaryTree remove(int d) {
        if (data == d) {
            if (left.isEmpty()) {
                return right;
            } else if (right.isEmpty()) {
                return left;
            } else {
                int b = left.biggest();
                return new NonEmptyBinaryTree(b, left.remove(b), right);
            }
        } else if (d < data) {
            return new NonEmptyBinaryTree(data, left.remove(d), right);
        } else { // d > data
            return new NonEmptyBinaryTree(data, left, right.remove(d));

        }

    }

    @Override
    public int balanceFactor() {
        return left.height() - right.height();
    }

    @Override
    public boolean avlBalanced() {
        return -1 <= balanceFactor() && balanceFactor() <= 1 && left.avlBalanced() && right.avlBalanced();
    }
}
