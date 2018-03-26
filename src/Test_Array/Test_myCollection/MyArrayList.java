package Test_Array.Test_myCollection;

import java.util.ArrayList;

/**
 * 模拟实现JDK中提供的ArrayList类
 */
public class MyArrayList {
    /**
     * The value is used for object storage
     */
    private Object[] value;

    /**
     * The size is the number of object used
     */
    private int size;

    public MyArrayList(){
        this(10); //this 特殊用法，在构造器中调用另一个构造器，和下面的语句功能一样
//        value = new Object[16];

    }

    public MyArrayList(int size){ //可被上面的this调用的另一个构造器
        if (size < 0 ){ //若参数小于0抛异常
            try {
                throw new Exception(); //手动抛出异常，以后再详解
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        value = new Object[size];
    }

    public int indexOf(Object obj){ //返回容器内从左往右（正序）指定对象的序号
        if (obj==null){
            return -1;
        }else {
            for (int i = 0 ; i<value.length;i++){
                if (obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }

    public int lastIndexOf(Object obj){ //返回容器内从右往左（倒序）指定对象的序号
        if (obj==null){
            return -1;
        }else {
            for (int i = value.length-1 ; i>=0;i--){
                if (obj==value[i]){
                    return i;
                }
            }
            return -1;
        }
    }

    public Object set(int index, Object object) {
        rangeCheck(index);//先检查
        Object old = value[index];
        value[index] = object;
        return old;
    }

    private void rangeCheck(int index){ //检查索引范围是否合法
        if (index < 0 || index > size - 1){ //[0,size-1]
            try {
                throw new Exception(); //手动抛出异常，以后再详解
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public  void add(Object obj){
        value[size]= obj;
        size++;
        if (size >= value.length){// 装不下需扩容
            int newCapacity = value.length*2;
            Object[] newList = new Object[newCapacity];
//          System.arraycopy(); 暂时不用这个

            for (int i = 0; i < value.length; i++){
                newList[i] = value[i];
            }
            value = newList;

        }
    }

    public Object get(int index){ //调用容器内的某个对象的方法
        rangeCheck(index);//检查索引合法性
        return value[index];
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);
        list.add("aaa");
        list.add(new Human("Henry"));
        list.add("bbbbb");
        list.add("bbf");
        list.add("bbrrrr");
        System.out.println(list.get(1));//返回的是对象的toString

        Human h = (Human) list.get(1);//强制把返回的对象转型为Human型
        System.out.println(h.getName());

//        System.out.println(list.get(3));//数组越界了
        System.out.println(list.size());
    }

}
