package Test_Collection.Iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 目标：使用泛型，可以操作多个类型
 */
public class MyArrayList<E> implements Iterable<E> { //要想该类可以用foreach迭代需要使用Iterable接口
    //数组存储值
    private Object[] elem = new Object[5];
    //实际大小
    private int size = 0;

    public int size() {
        return this.size;
    }

    /**
     * 在末尾添加元素
     *
     * @param ele
     */
    public void add(E ele) {
        if (this.size == elem.length) { //容量不够就需要扩容
            elem = Arrays.copyOf(elem, elem.length + 5);
        }
        elem[size] = ele;//数组中加入元素，放在最后
        size++;//实际大小+1

    }


    //创建Iterator迭代器接口实现类（匿名）的对象
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            //计数器-->指针 游标
            private int cursor = -1;

            //判断是否存在下一个
            public boolean hasNext() {
                return cursor + 1 < size;
            }

            //获取下一个
            public E next() {
                cursor++;
                return (E) elem[cursor];
            }

            //删除下一个
            public void remove() {
                //移动数组的元素，后面的所有元素要前移一位补上被删掉的元素
                System.arraycopy(elem, cursor + 1, elem, cursor, size - (cursor + 1));
                //实际大小-1
                size--;
                //游标回退
                this.cursor--;
            }
        };
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        for (Integer e : list) {
            System.out.println(e);
        }
        System.out.println("-----------------");
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("Yeah!");
        list2.add("Wow!");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

    }
}
