package Test_Collection.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用Javabean封装表格数据
 */
public class Test01 {
    public static void main(String[] args){
        /* 如果不用构造器只能一个个输入表格数据
        Employee e = new Employee();
        e.setId(0301);
        e.setName("大力哥");
        e.setDepartment("项目部");
        e.setSalary(3000);
        String strDate = "2007-10";
        DateFormat format = new SimpleDateFormat("yyyy-MM");//复习之前的时间格式转换
        e.setHireDate(format.parse(strDate));
        */
        //一个对象对应一行记录
        Employee e = new Employee("0301","大力哥",3000,"项目部","2007-10");
        Employee e2 = new Employee("0302","春哥",3500,"财务部","2006-10");
        Employee e3 = new Employee("0303","姜哥",3560,"人力资源部","2006-04");

        List<Employee> list = new ArrayList<>();

        list.add(e);
        list.add(e2);
        list.add(e3);
        printEmpName(list);


    }

    public static void printEmpName(List<Employee> list){
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i).getName());
        }
    }
}
