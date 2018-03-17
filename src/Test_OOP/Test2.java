package Test_OOP;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Henry";
        s1.age = 28;
        Computer c = new Computer();
        c.brand = "联想";
        c.cupSpeed = 100;

        s1.computer = c;
        System.out.println(s1.computer.brand);


    }
}
