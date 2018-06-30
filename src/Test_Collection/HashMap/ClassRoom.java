package Test_Collection.HashMap;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个班级多个学生（学生列表）
 */
public class ClassRoom {
    private String no; // 班级
    private List<Student> stuList; //学生列表
    private double total; //总分

    public ClassRoom() {
        stuList = new ArrayList<Student>();
    }

    public ClassRoom(String no) {
        this();
        this.no = no;
    }

    public ClassRoom(String no, List<Student> stuList, double total) {
        this.no = no;
        this.stuList = stuList;
        this.total = total;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
