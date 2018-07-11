package Test_Collection.Sort.TreeSet;

/**
 * 员工类
 */
public class Worker implements Comparable<Worker> {
    private String type;//工种
    private double salary;//工资

    public Worker() {
    }

    public Worker(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 按工资升序排列
     */
    @Override
    public int compareTo(Worker o) {
//        return this.salary > o.salary ? 1: (this.salary == o.salary ? 0 : -1);
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "工种：" + type + ", 工资：" + salary + "\n";
    }
}
