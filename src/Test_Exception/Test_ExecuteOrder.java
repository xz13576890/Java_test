package Test_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
测试try,catch,finally,return均存在时的执行顺序
 */
public class Test_ExecuteOrder {
    public static void main(String[] args) {
        String str = new Test_ExecuteOrder().openFile();
        System.out.println(str);
    }

    private String openFile(){

        try {
            System.out.println("aaa");
            FileInputStream fis = new FileInputStream("c:/Code/java/a444.txt");//可以更改这里的文件名来选择是否
            // 触发异常，默认有效文件是a.txt
            int a = fis.read();
            System.out.println("bbb");
            return "step1";
        }catch (FileNotFoundException e){
            System.out.println("catching!!!");
            e.printStackTrace();
            return "step2";   //先确定返回的值，并不会直接结束运行
        }
        catch (IOException e) {
            e.printStackTrace();
            return "step3";
        }finally {
            System.out.println("finally!!!");
            //不要在finally里加return语句！！！
            //return "ccc";
        }


    }




}
