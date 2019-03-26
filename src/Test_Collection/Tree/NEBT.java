package Test_Collection.Tree;

/**
 * Not empty binary tree(immutable) 非空二叉树(不可变型）
 */
public class NEBT extends BT {
    private int key;
    private BT left, right;


    public NEBT(int d) {
        key = d;
        left = new EBT();
        right = new EBT();
    }

    public NEBT(int k, BT l, BT r) {
        key = k;
        left = l;
        right = r;
    }

    @Override
    public int size() {
        return 1 + left.size() + right.size();
    }

    @Override
    public boolean elementOf(int d) {
        if (d == key) {
            return true;
        } else if (d < key) {
            return left.elementOf(d);
        } else { //d > key
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
    public BT insert(int d) {
        if (d == key) {
            return this;
        } else if (d < key) {
            return new NEBT(key, left.insert(d), right);
        } else { //d > key
            return new NEBT(key, left, right.insert(d));
        }

    }

    @Override
    public String show() {
        //广度优先显示，从左至右
//        return left.show() + " " + key + " " + right.show();

        //把root单独拿出来显示
        return key + "(" + left.show() + " , " + right.show() + ")";
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
        if (right instanceof EBT) {
            return key;
        } else {
            return right.biggest();
        }
    }

    @Override
    public BT remove(int d) {
        if (key == d) {
            if (left.isEmpty()) {
                return right;
            } else if (right.isEmpty()) {
                return left;
            } else {
                int b = left.biggest();
                return new NEBT(b, left.remove(b), right);
            }
        } else if (d < key) {
            return new NEBT(key, left.remove(d), right);
        } else { // d > key
            return new NEBT(key, left, right.remove(d));

        }

    }
}
