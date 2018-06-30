package Test_Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 用分拣存储解决1对多的情况
 * 例题：统计句中单词出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 思路：
 * 1、分割字符串
 * 2、分拣存储
 * 3、按要求查看每个单词出现的次数
 */
public class MapDemo01 {

    public static void main(String[] args) {
        //1、分割字符串
        String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
        //2、分拣存储
        Map<String, Integer> map = new HashMap<>();
        for (String key : arr) {
//            System.out.println(key);
            //计数Map写法1：
            /*if (!map.containsKey(key)){ //查看是否存在该单词，若不存在记为1次
                map.put(key,1);
            }else { //若已经存在，则在原有基础上+1
                map.put(key,map.get(key)+1);
            }*/
            //计数Map写法2：
            Integer value = map.get(key);
            if (null == value) { //若key不存在则记为1
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
        }
        //3、查看每个单词出现的次数，由于Map无法直接遍历所以需要借助其key的Set
        Set<String> keySet = map.keySet();
        //获取迭代器对象
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) { //先判断
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }

    }

}

