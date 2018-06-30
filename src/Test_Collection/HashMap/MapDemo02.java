package Test_Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 用分拣存储解决1对多的情况
 * 例题：统计句中单词出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 思路：
 * 1、分割字符串
 * 2、分拣存储
 * 3、按要求查看每个单词出现的次数
 * 4、加入面向对象
 */
public class MapDemo02 {

    public static void main(String[] args) {
        //1、分割字符串
        String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
        //2、分拣存储
        Map<String, Letter> map = new HashMap<>();
        for (String key : arr) {
            /*思路1：
            //第一次查看是否存在分拣口袋
            if (!map.containsKey(key)) { //若不存在则新建一个袋子
                map.put(key, new Letter(key));//key的value是一个新建的Letter类
            }
            //获取口袋
            Letter value = map.get(key); //这里每个key的value已经是一个Letter类了，所以不用再new
            value.setCount(value.getCount() + 1); //装东西
            */

            //思路2：
            Letter value = map.get(key);
            if (null == value) {
                value = new Letter();
                map.put(key, value);
            }
            value.setCount(value.getCount() + 1);

        }
        //3、查看每个单词出现的次数
        for (String key : map.keySet()) {
            Letter value = map.get(key);
            System.out.println(key + " --> " + value.getCount());
        }


    }

}

