package Test_Collection.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用Map封装数据
 */
public class Test02 {

    public static void main(String[] args) {
        //一个Map对象对应一行记录
        Map map = new HashMap();
        map.put("id",0301);
        map.put("name","大力哥");
        map.put("salary",3050);
        map.put("department","项目部");
        map.put("hireDate","2007-10");

        Map map2 = new HashMap();
        map2.put("id",0302);
        map2.put("name","春哥");
        map2.put("salary",3500);
        map2.put("department","教学部");
        map2.put("hireDate","2006-10");

        Map map3 = new HashMap();
        map3.put("id",0303);
        map3.put("name","姜哥");
        map3.put("salary",3550);
        map3.put("department","人力资源管部");
        map3.put("hireDate","2005-04");

        List<Map> list = new ArrayList<>();

        list.add(map);
        list.add(map2);
        list.add(map3);
        printEmpName(list);

    }

    public static void printEmpName(List<Map> list){
        for (Map tempMap : list) {
            System.out.println(tempMap.get("name")+"--"+tempMap.get("salary"));
        }
    }

}
