package Test_Collection.HashMap;

import java.util.*;

/**
 * 例题：定义一个Student类，属性：name 姓名；no 班级号；score 成绩；现在将若干Student对象放入List，
 * 请统计出每个班级的总分和平均分。
 * 方案：面向对象+分拣存储（1对多）
 */
public class MapDemo03 {

    public static void main(String[] args) {
        //1、考试
        List<Student> stuList = exam();
        //2、分析成绩
        Map<String,ClassRoom> map = count(stuList);
        //3、查看成绩（总分 平均分）
        view(map);
    }

    /**
     * 查看每个班的总分和平均分 -->遍历Map
     */
    public static void view(Map<String, ClassRoom> map) {
        Set<String> keys = map.keySet();
        //获取迭代器对象
        Iterator<String> keysIt = keys.iterator();
        //先判断
        while (keysIt.hasNext()) {
            //再获取
            String no = keysIt.next();
            ClassRoom cr = map.get(no);
            //查看总分 计算平均分
            double total = cr.getTotal();
            double avg = total / cr.getStuList().size();
            System.out.println(no + " --> " + total + " --> " + avg);
        }
    }

    /**
     * 统计分析
     * 1、面向对象
     * 2、分拣存储
     */
    public static Map<String, ClassRoom> count(List<Student> list) {
        Map<String, ClassRoom> map = new HashMap<>();
        //1、遍历List
        for (Student stu : list) {
            String no = stu.getNo();//班级编号
            double score = stu.getScore();//成绩
            //2、分拣 查看是否存在该编号的班级
            // 若不存在，创建班级
            ClassRoom cr = map.get(no);
            if (null == cr) {
                cr = new ClassRoom(no);
                map.put(no, cr);
            }
            // 若存在，放入学生
            cr.getStuList().add(stu);
            cr.setTotal(cr.getTotal() + score);//计算总分
        }
        return map;
    }

    /**
     * 模拟考试 放入测试数据到List中
     */
    public static List<Student> exam() {
        List<Student> list = new ArrayList<>();
        //存放学生成绩
        list.add(new Student("Henry", "A", 85));
        list.add(new Student("Jack", "A", 86));
        list.add(new Student("Tom", "A", 89));
        list.add(new Student("Marry", "B", 70));
        list.add(new Student("Walt", "B", 75));
        return list;
    }

}
