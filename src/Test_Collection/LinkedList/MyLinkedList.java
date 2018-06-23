package Test_Collection.LinkedList;


/**
 * 自己实现一个链表类
 */
public class MyLinkedList {
    private Node first; //首位节点
    private Node last; //末尾节点
    private int size; //节点数量

    public void add(Object obj){
        Node n = new Node();
        if (first == null){
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            //若第一个节点为空，则此时链表中第一个节点也同时是最后一个节点
            first = n;
            last = n;
        }else {
            //若first不为空则直接往last节点后增加新的节点，因为不知道中间哪个节点为空,把自己作为新的last
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        size++;
    }

    public int size(){
        //写这个是按照规则增加调用方法，实际应用中该类里一般不会有main方法
        return size;
    }

    public Object get(int index){
        //index越界处理
        RangeCheck(index);
        Node temp = node(index);
        if (temp!= null){
            return temp.obj;
        }
        else {
            return null;
        }

    }

    private void RangeCheck(int index){
        //判断索引是否越界，需要写>=，因为数组下标从0开始，最后一个是[size-1]
        if (index < 0 || index >= size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(int index){
        //只考虑了从链表中间删除的情况，头尾要另作判断
        Node temp = node(index);
        if (temp!=null){
            Node up = temp.previous;
            Node down = temp.next;
            up.next = down;
            up.previous = up;
        }
        size--;
    }

    public void add(int index, Object obj){
        //链表插入的原理是打断原索引位的节点使原节点的上家的下家改为新节点，新节点的下家改为原节点
        Node temp = node(index);
        Node newNode = new Node();
        newNode.obj = obj;
        if (temp!=null){
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
            size++;
        }
    }

    /**
     * 返回指定索引的节点
     */
    public Node node(int index){
        //链表不像数组并没有索引，但我们可以手动标记索引，记第一个节点为0，1，2，3……依次往后
        Node temp = null;
        if (first != null){
            //这里可以用二分法遍历效率更高
            if (index < (size >> 1)){ //>>1表示右移1位运算，即除以2，当index小于size的一半时顺序遍历
                temp = first;
                for (int i =0; i<index;i++){
                    temp = temp.next; //顺序就找下一个
                }
            }else { //当index大于size的一半时逆序遍历
                temp = last;
                for (int i = size - 1; i > index; i--){
                    temp = temp.previous; //逆序就找前一个
                }
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("aaa");
        list.add("bbb");
//        list.add(1,"BBBBB");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
//        list.remove(1);
        System.out.println(list.get(3));



    }



}


