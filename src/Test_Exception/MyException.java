package Test_Exception;

/**
 * 测试自定义异常
 */
public class MyException extends Exception { // 自定义异常

    public MyException(){

    }

    public MyException(String message){
        super(message);

    }

}

class TestMyeException{

    void test()throws MyException { //声明异常

    }

    public static void main(String[] args) {
        try { // 处理异常
            new TestMyeException().test(); //方法调用触发异常
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}