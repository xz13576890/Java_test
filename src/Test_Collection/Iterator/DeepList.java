package Test_Collection.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 目标：深入理解迭代器的原理 --> 一个容器可以创建多个迭代器对象
 * 途径：使用了内部类|匿名内部类
 * 深入：1、使用内部类实现迭代器
 * 2、使用Iterable接口实现foreach迭代
 * 3、加入末尾添加元素的方法
 */
public class DeepList implements java.lang.Iterable{ //要想该类可以用foreach迭代需要使用Iterable接口
    //数组存储值
    private String[] elem = new String[5];
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
    public void add(String ele) {
        if (this.size == elem.length) { //容量不够就需要扩容
            elem = Arrays.copyOf(elem, elem.length + 5);
        }
        elem[size] = ele;//数组中加入元素，放在最后
        size++;//实际大小+1

    }

    //内部类
    private class MyIterator implements Iterator {
        //计数器-->指针 游标
        private int cursor = -1;

        //判断是否存在下一个
        public boolean hasNext() {
            return cursor + 1 < size;
        }

        //获取下一个
        public String next() {
            cursor++;
            return elem[cursor];
        }

        //删除下一个
        public void remove() {
            //移动数组的元素，后面的所有元素要前移一位补上被删掉的元素
            System.arraycopy(elem, cursor + 1, elem, cursor, DeepList.this.size - (cursor + 1));
            //实际大小-1
            DeepList.this.size--;
            //游标回退
            this.cursor--;
        }

    }

    public Iterator iterator() {
        return new MyIterator();
    }

    //将一个内部类移动到方法里就变成了方法内部类
    public Iterator iterator2() {
        class MyIterator implements Iterator {
            //计数器-->指针 游标
            private int cursor = -1;

            //判断是否存在下一个
            public boolean hasNext() {
                return cursor + 1 < size;
            }

            //获取下一个
            public String next() {
                cursor++;
                return elem[cursor];
            }

            //删除下一个
            public void remove() {
                //移动数组的元素，后面的所有元素要前移一位补上被删掉的元素
                System.arraycopy(elem, cursor + 1, elem, cursor, DeepList.this.size - (cursor + 1));
                //实际大小-1
                size--;
                //游标回退
                this.cursor--;
            }

        }
        return new MyIterator();
    }

    //创建Iterator迭代器接口实现类（匿名）的对象
    public Iterator iterator3() {
        return new Iterator() {
            //计数器-->指针 游标
            private int cursor = -1;

            //判断是否存在下一个
            public boolean hasNext() {
                return cursor + 1 < size;
            }

            //获取下一个
            public String next() {
                cursor++;
                return elem[cursor];
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
        DeepList list = new DeepList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        Iterator it = list.iterator3();
        while (it.hasNext()) { //先判断 后获取
            System.out.println(it.next());
//            it.remove();
        }
        System.out.println(list.size());
        for (Object obj : list){
            System.out.println(obj);
        }
        System.out.println("--------------------------------");
        it = list.iterator2();
        while (it.hasNext()) { //先判断 后获取
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("a");
        list1.add("a");
        for (String str : list1){
            System.out.println(str);
        }
    }
}
