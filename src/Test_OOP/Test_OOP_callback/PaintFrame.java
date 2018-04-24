package Test_OOP.Test_OOP_callback;

public class PaintFrame {
    public static void drawFrame(IMyFrame f){
        System.out.println("Start line");
        System.out.println("Add loop");
        System.out.println("Check message stack");

        //画窗口
        f.paint(); //回调应用，把“钩子”放在这里，参数里new什么就调什么，只有这里会调用不同的方法

        System.out.println("启动缓存，增加效率");

    }

    public static void main(String[] args) {
        drawFrame( new GameFrame01());
    }
}

class GameFrame01 implements IMyFrame{

    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }

}

class GameFrame02 implements IMyFrame{

    public void paint(){
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }

}

