package Test_Collection.Tree.AvlTree;

/**
 * Avl tree: 自平衡二叉查找树
 */
public class AvlNonEmptyBinaryTree extends NonEmptyBinaryTree {

    public AvlNonEmptyBinaryTree(int data) {
        super(data,new AvlEmptyBinaryTree(),new AvlEmptyBinaryTree());
    }

    public AvlNonEmptyBinaryTree(int d, BinaryTree l, BinaryTree r) {
        super(d, l, r);
    }

    @Override
    public BinaryTree insert(int d) {
        AvlNonEmptyBinaryTree res;
        if (data == d) {
            return this;
        } else if (d < data) {
            left = left.insert(d);
            res = this;
        } else { //d > key
            right = right.insert(d);
            res = this;
        }
        if (res.balanceFactor() == -2 && res.right.balanceFactor() == 1) {
            return rotateRL();
        } else if (res.balanceFactor() == -2 && res.right.balanceFactor() == -1) {
            return rotateRR();
        } else if (res.balanceFactor() == 2 && res.left.balanceFactor() == 1) {
            return rotateLL();
        } else if (res.balanceFactor() == 2 && res.left.balanceFactor() == -1) {
            return rotateLR();
        }
        return res;

    }


    @Override
    public BinaryTree remove(int d) {
        throw new Error();  // currently the avl remove has not be implemented

    }


    @Override
    public int balanceFactor() {
        return super.balanceFactor();
    }

    @Override
    public boolean avlBalanced() {
        return super.avlBalanced();
    }

    //四种不平衡的情况：左右，左左；右左，右右
    private AvlNonEmptyBinaryTree rotateRL() {
        AvlNonEmptyBinaryTree r = (AvlNonEmptyBinaryTree) this.right;
        AvlNonEmptyBinaryTree rl = (AvlNonEmptyBinaryTree) ((AvlNonEmptyBinaryTree) this.right).left;
        return (new AvlNonEmptyBinaryTree(rl.data,new AvlNonEmptyBinaryTree(data,left,rl.left),new AvlNonEmptyBinaryTree(r.data,rl.right,r.right)));
    }
    private AvlNonEmptyBinaryTree rotateRR() {
        AvlNonEmptyBinaryTree r = (AvlNonEmptyBinaryTree) this.right;
        AvlNonEmptyBinaryTree rr = (AvlNonEmptyBinaryTree) ((AvlNonEmptyBinaryTree) this.right).right;
        return (new AvlNonEmptyBinaryTree(r.data,new AvlNonEmptyBinaryTree(data,left,r.left),rr));
    }
    private AvlNonEmptyBinaryTree rotateLL() {
        AvlNonEmptyBinaryTree l = (AvlNonEmptyBinaryTree) this.left;
        AvlNonEmptyBinaryTree ll = (AvlNonEmptyBinaryTree) ((AvlNonEmptyBinaryTree) this.left).left;
        return (new AvlNonEmptyBinaryTree(l.data, ll,new AvlNonEmptyBinaryTree(data,l.right,right)));
    }
    private AvlNonEmptyBinaryTree rotateLR() {
        AvlNonEmptyBinaryTree l = (AvlNonEmptyBinaryTree) this.left;
        AvlNonEmptyBinaryTree lr = (AvlNonEmptyBinaryTree) ((AvlNonEmptyBinaryTree) this.left).right;
        return (new AvlNonEmptyBinaryTree(lr.data,new AvlNonEmptyBinaryTree(l.data,l.left,lr.left),new AvlNonEmptyBinaryTree(data,lr.right,right)));
    }

}
