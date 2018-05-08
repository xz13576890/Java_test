package Test_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
测试IO流中FileReader类的异常规则以及继承异常写法
 */
public class TestReadFile {
    public static void main(String[] args) {
        FileReader reader = null;//放到外面的变量声明
        try {
            reader = new FileReader("c:/Code/java/a.txt"); //FileReader用于读取字符文件的便捷类
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            System.out.println("" + c + c2 );
        }catch (FileNotFoundException e){ //子类异常要放在父类之前
            e.printStackTrace();
        }catch (IOException e){ //可以不写
            e.printStackTrace();
            System.out.println();
        }finally {
            try {  //对该对象的处理也要检查异常
                if (reader != null){ //防止对象为空，比如第12行new的路径不存在，对象没建立成功
                    reader.close();//try语句块内建立的变量是局部变量，出了try语句块外就无法识别，
                    // 所以可以把该变量的声明放到外面作为全局变量
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}

