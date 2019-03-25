package Test_Collection.Tree;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * General tree(普通树)
 */
public class GTree {

    String data;
    ArrayList<GTree> children;

    public GTree(String data) {
        this.data = data;
        children = new ArrayList<GTree>();
    }

    public GTree(String data, GTree trees[]) {
        this.data = data;
        children = new ArrayList<GTree>();
        for (GTree t : trees) {
            children.add(t);
        }
    }

    @Override
    public String toString() {
        String res = data + "{";
        for (int i = 0; i < children.size(); i++) {
            res += children.get(i).toString();
            if (i < children.size() - 1) {
                res += ",";
            }
        }
        res += "}";
        return res;
    }

    /**
     * depth first traversal 深度优先搜索（由上自下，纵列扫描）
     */
    public void  dft(){
        System.out.print(data + " ");
        for (GTree t : children){
            t.dft();
        }
    }

    /**
     * breadth first traversal 广度优先搜索（从左到右，横向扫描）
     */
    public void bft(){
        LinkedList<GTree> queue = new LinkedList<>();
        queue.add(this);
        while (queue.size()>0){
            GTree t = queue.removeFirst();
            System.out.print(t.data + " ");
            for (GTree g : t.children){
                queue.add(g);
            }
        }
    }

    public int size() {
        int sum = 1;
        for (GTree t : children) {
            sum += t.size();
        }
        return sum;
    }

    public int height() {
        int max = 0;
        for (GTree t : children) {
            max = Math.max(max, t.height()+1);
        }
        return max;
    }

    public static void main(String[] args) {
        GTree c = new GTree("C");

        /*  建立一个如下结构的树
         *          A
         *       /  |  \
         *      B   D   E
         *    /        / \
         *   C        F   G
        */
        GTree tree = new GTree("A",
                new GTree[]{
                        new GTree("B", new GTree[]{new GTree("C")}),
                        new GTree("D"),
                        new GTree("E", new GTree[]{new GTree("F"),
                                new GTree("G")})});

        System.out.println(c);
        System.out.println(tree);
        System.out.println("Size: "+ tree.size());
        System.out.println("Height: "+ tree.height());
        tree.dft();
        System.out.println();
        tree.bft();

    }
}
