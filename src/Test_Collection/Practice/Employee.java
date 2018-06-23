package Test_Collection.Practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 容器存储综合练习之雇员表格
 */
public class Employee { //Javabean 只有属性和相关的set，get方法的实体类
    private String id;
    private String name;
    private int salary;
    private String department;
    private Date hireDate;

    public Employee(){

    }

    public Employee(String id, String name, int salary, String department, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;

        DateFormat format = new SimpleDateFormat("yyyy-MM");//复习之前的时间格式转换
        try {
            this.hireDate = format.parse(hireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
