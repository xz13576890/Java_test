package Test_OOP_this;

public class Student {
     String name;
     int id;

    public Student(String name,int id){
        this();//特殊用法：通过this调用其它构造方法,必须位于第一句
        this.name = name;//this指向将来会被这个构造方法构造的对象,其所用的name是类属性的name,不加this则是构造器本身的形参name
        this.id = id;
    }
    public void setName(String name){
        this.name = name;//this指向将来会调用这个方法的对象
    }

    public Student(){   //重载一个构造器
        System.out.println("构造一个对象");
    }



    public void study(){
        this.name = "Jack";//this指向将来会调用这个方法的对象

         System.out.println(name + "在学习");
    }

    public void sayHello(String sname){

         System.out.println(name + "向"+sname+"说：你好");
    }


}
