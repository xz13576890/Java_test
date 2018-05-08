package Test_Exception;

/*
测试异常的一些基本属性和操作
 */
public class TestException {
    public static void main(String[] args) {
//        int i = 1/0; //Unchecked Exception 属于Runtime Exception交由系统自动处理

        try { //Checked Exception 需手动捕获
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Computer c = null;//建立了一个空对象
        if (c != null) { //防止对象为空，提前加判断
            c.start();//操作空对象或空数组时会报空指针异常 NullPointerException
        }

        String str = "1234abcd";
        try {
            Integer i = new Integer(str);//数字格式异常 NumberFormatException
        }catch (Exception e){ //try中的异常被捕获，所以下面的“can you see me？”运行了
            e.printStackTrace();
        }

        //java中若一个抛出的异常没有被捕获，则之后的代码不会再运行(可以去掉上面的try和catch再试
        System.out.println("Can you see me???");

    }
}

class Computer{
    void start(){
        System.out.println("计算机启动！");
    }
}
