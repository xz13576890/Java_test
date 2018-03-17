package Test_OOP_static;

public class Student {
     String name;
     int id;
     static int ss;//建立一个从属于类的static变量
     public static void printss(){  //建立一个从属于类的static方法

         System.out.println(ss);
     }


    //动态的行为
    public void study(){

         System.out.println(name + "在学习");
    }

    public void sayHello(String sname){

         System.out.println(name + "向"+sname+"说：你好");
    }


}
