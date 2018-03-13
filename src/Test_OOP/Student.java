package Test_OOP;

public class Student {
    //静态的数据
    private String name;
    private int id;
    private int age;
    private String gender;
    int weight;

    //动态的行为
    public void study(){
        System.out.println(name + "在学习");
    }

    public void sayHello(String sname){
        System.out.println(name + "向"+sname+"说：你好");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Henry";
        s1.study();
        s1.sayHello("John");

        Student s2 = new Student();
        s2.age = 18;
        s2.name = "John";

    }
}
