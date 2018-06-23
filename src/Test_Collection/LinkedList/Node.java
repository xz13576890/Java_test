package Test_Collection.LinkedList;

//用来表示一个节点，属性有：上家位置，本家内容，下家位置
public class Node {
    //这里为了便于后面理解去掉了这三个属性前置的private，在实际运用中还是需要加上的
    Node previous; //上一个节点（上家位置）
    Object obj;    //本家内容
    Node next;     //下一个节点（下家位置）

    public Node(){
    }

    public Node(Node previous, Object obj, Node next) {
        this.previous = previous;
        this.obj = obj;
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
