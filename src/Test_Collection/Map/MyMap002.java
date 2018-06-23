package Test_Collection.Map;


import java.util.LinkedList;

/**
 * 自定义Map的升级版
 * 1.提高查询的效率
 */
public class MyMap002 {

    LinkedList[] arr = new LinkedList[999];//Map的底层结构是链表数组+链表
    int size;

    public void put(Object key, Object value) {
        MyEntry e = new MyEntry(key, value);

        int hash = key.hashCode();
        hash = hash<0 ? -hash:hash; //三元运算符，处理hashcode为负的情况

        int a = hash % arr.length;//用key的哈希码对数组长度取余来生成一个索引值
        if (arr[a] == null) {//如果数组该索引值处为空
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        } else {
            LinkedList list = arr[a];
            for (int i = 0; i < list.size(); i++) {
                MyEntry e2 = (MyEntry) list.get(i);
                if (e2.key.equals(key)) {
                    e2.value = value;//键值重复则覆盖原值
                    return;
                }
            }
            arr[a].add(e);
        }
    }

    public Object get(Object key){
        int a = key.hashCode() % arr.length;
        if (arr[a] != null) {
            LinkedList list = arr[a];
            for (int i =0; i<list.size();i++){
                MyEntry e = (MyEntry)list.get(i);
                if (e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyMap002 m = new MyMap002();
        m.put("Henry",new Wife("Emma"));
        m.put("Josh",new Wife("Mary"));
        Wife w = (Wife)m.get("Henry");
        System.out.println(w.name);
        m.put("Henry",new Wife("Sara"));
        System.out.println(((Wife) m.get("Henry")).name);


    }

}
