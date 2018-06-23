package Test_Collection.Map;

/**
 * 自定义实现一个基本Map的功能
 * 存放键值对，根据键对象找值对象，键不能重复
 */
public class MyMap001 {

    MyEntry[] arr = new MyEntry[999];//先暂时随便写一个容量
    int size;//默认值是0

    public void put(Object key, Object value){
        MyEntry e = new MyEntry(key,value);
        //检测键值是否已存在，若已存在新值会覆盖旧值
        for (int i = 0; i<size;i++){
            if(arr[i].key.equals(key)){
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;//size++在这里是先赋值再自增的意思
    }

    public Object get(Object key){
        for (int i = 0; i<size;i++){
            if(arr[i].key.equals(key)){ //注意Map和Set在这里的比较都用equals方法不用==
                return arr[i].value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key){
        for (int i = 0; i<size;i++){
            if(arr[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value){
        for (int i = 0; i<size;i++){
            if(arr[i].value.equals(value)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        MyMap001 m = new MyMap001();
        m.put("Henry",new Wife("Emma"));
        m.put("Josh",new Wife("Mary"));
        Wife w = (Wife)m.get("Henry");
        System.out.println(w.name);
        m.put("Henry",new Wife("Sara"));
        System.out.println(((Wife) m.get("Henry")).name);

    }
}

class MyEntry{
    Object key;
    Object value;

    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
