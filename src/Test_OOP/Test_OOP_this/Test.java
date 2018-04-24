package Test_OOP.Test_OOP_this;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Gary",55);
        Student s2 = new Student();
        System.out.println(s1.name + " " + s1.id);
        s1.name = "Jack";
        s1.id = 2;
        System.out.println(s1.name + " " + s1.id);
        s1.setName("Kale");
        System.out.println(s1.name);
        s1.study();

    }
}
