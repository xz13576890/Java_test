package Test_Collection.ArrayList;

/**
 * 自己实现一个ArrayList,帮助更好理解底层结构
 */
public class MyArrayList {

    private Object[] elementData;
    private  int size;//size就是数组里现在元素的数量

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return  size == 0;
    }

    public MyArrayList(){
        //用this调用已知构造方法
        this(10);
    }

    public MyArrayList(int initialCapacity){
        if (initialCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public void add(Object obj){
        //数组扩容和数据拷贝
        if (size == elementData.length){
            Object[] newArray = new Object[size*2 + 1];
            //数组拷贝参数：原数组，原数组拷贝起始索引，目标数组，拷贝至目标数组起始索引，原数组拷贝长度
            System.arraycopy(elementData,0,newArray,0,elementData.length);//等同于下面的for loop
//            for (int i = 0; i<elementData.length;i++){
//                newArray[i] = elementData[i];
//            }
            elementData = newArray;
        }
        elementData[size] = obj;
        size++;
    }

    public Object get(int index){
        RangeCheck(index);
        return elementData[index];
    }

    public void remove(int index){
        //删除指定位置的对象
        //a b c d
        RangeCheck(index);//检查index是否合法
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        }
        elementData[--size] = null; // clear to let GC do its work
    }

    public void remove(Object obj){
        //直接删除对象
        for (int i = 0 ; i< size; i++){
            if (get(i).equals(obj)){ //底层调用的是equals方法而不是==
                remove(i);
            }
        }
    }

    public Object set(int index, Object obj){
        RangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    public void add(int index, Object obj){
        RangeCheck(index);
        ensureCapacity();//数组扩容检测
        System.arraycopy(elementData, index, elementData, index + 1,
                size - index);
        elementData[index] = obj;
        size++;
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

    private void ensureCapacity(){
        //数组扩容和拷贝
        if (size == elementData.length){
            Object[] newArray = new Object[size*2 + 1];
            //数组拷贝参数：原数组，原数组拷贝起始索引，目标数组，拷贝至目标数组起始索引，原数组拷贝长度
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        System.out.println(list.size);
        System.out.println(list.get(3));
        System.out.println((int)2.4/2);

    }
}
