package Test_OOP;

public class Test1 {
    public static void main(String[] args) {
        //通过类加载器Class Loader加载Student类，加载后在方法区method中就有了Student类的信息
        Student s1 = new Student();
        s1.name = "Henry";
        s1.study();
        s1.sayHello("John");
        Student s2 = new Student();
        s2.age = 18;
        s2.name = "John";
    }
}
