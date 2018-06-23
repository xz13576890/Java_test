package Test_Generic.Generic03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 泛型嵌套--> 由外到内拆分
 * 学生查成绩
 */
public class StudentApp {

    public static void main(String[] args) {
        //学生tom获得优秀成绩
        Student<String> tom = new Student<String>();
        tom.setScore("优秀");
        System.out.println(tom.getScore());

        //泛型嵌套，一层包一层：A班类的stu属性是学生类对象
        AClass<Student<String>> a_class = new AClass<Student<String>>();
        a_class.setStu(tom);
        tom = a_class.getStu();
        String score  = tom.getScore();
        System.out.println(score);

        //泛型嵌套在HashMap的应用
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","java300");
        map.put("b","马士兵javase");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " --> " + value);
        }





    }
}
