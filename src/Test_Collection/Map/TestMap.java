package Test_Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *  测试Map的基本用法
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println(map.isEmpty());
        map.put("Henry",new Wife("Emma"));
        map.put("Josh",new Wife("Mary"));

//        map.remove("Henry");

        Wife w = (Wife)map.get("Henry");//get方法返回的是Object所以需要强制转型
        System.out.println(w.name);

    }
}

class Wife{
    String name;
    public Wife (String name){
        this.name = name;
    }
}