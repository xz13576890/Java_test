package Test_Exception;


import java.io.FileReader;
import java.io.IOException;

/**
 *测试声明异常方法
 */
public class Test_throws_exception {

    public static void main(String[] args) {
        String str = null;
        try {
            str = new Test_throws_exception().openFile(); //谁调用谁负责try-catch异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

    String openFile() throws IOException { //声明一个异常，谁调用谁处理,如果有多个异常要用逗号隔开

        FileReader reader = new FileReader("c:/Code/java/a444.txt");
        char c = (char)reader.read();
        System.out.println(c);
        return ""+ c;

    }
}
