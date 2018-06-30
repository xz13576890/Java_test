package Test_Collection.Iterator;

/**
 * 目标：理解迭代器的原理
 * 迭代器：遍历使用
 */
public class SimpleList {
    //数组存储值
    private String[] elem = {"a","b","c"};
    //大小
    private int size = elem.length;
    public int size(){
        return this.size;
    }

    //计数器-->指针 游标
    private int cursor = -1;
    //判断是否存在下一个
    public boolean hasNext(){
        return cursor +1 < size;
    }
    //获取下一个
    public String next(){
        cursor++;
        return elem[cursor];
    }
    //删除下一个
    public void remove(){
        //移动数组的元素，后面的所有元素要前移一位补上被删掉的元素
        System.arraycopy(elem, cursor +1,elem, cursor,this.size-(cursor +1));
        //实际大小-1
        this.size--;
        //游标回退
        this.cursor--;
    }

    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        if (list.hasNext()){
            System.out.println(list.next());
            list.remove();
        }
        if (list.hasNext()){
            System.out.println(list.next());
            list.remove();
        }
        if (list.hasNext()){
            System.out.println(list.next());
            list.remove();
        }
        //先判断后获取
        if (list.hasNext()){ //不会获取值
            System.out.println(list.next());
            list.remove();
        }
        System.out.println(list.size());
    }
}
