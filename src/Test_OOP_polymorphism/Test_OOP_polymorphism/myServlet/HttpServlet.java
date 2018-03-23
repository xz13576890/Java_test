package Test_OOP_polymorphism.Test_OOP_polymorphism.myServlet;

public class HttpServlet {
    public void service(){
        System.out.println("HttpServlet.service()");
        doGet();

    }

    public void doGet(){
        System.out.println("HttpServlet.doGet");


    }


}
