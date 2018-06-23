package Test_Exception;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *test手动抛出异常
 */
public class Test_throw_exception {
    public static void main(String[] args) {

        File f = new File("c:/Code/java/a444.txt");
        if (!f.exists()){
            try {
                throw new FileNotFoundException("File cannot be found!"); //手动抛出异常（自己new一个异常对象然后抛出）
            }catch (FileNotFoundException e){ //需要手动处理
                e.printStackTrace();
            }
        }



    }
}
