package Test_OOP_callback;


public class MyFrame {
    public void paint(){
        System.out.println("把自己窗口画出来");
    }
}

interface IMyFrame{ //可以用接口替代上面的抽象类（如果有）
    void paint();
}