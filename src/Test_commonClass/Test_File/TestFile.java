package Test_commonClass.Test_File;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("c:/Code/java/Ant.java");//选择详细路径下的某个文件
        File f2 = new File("c:/Code/java");
        File f3 = new File(f2,"TestThis.java");//在某个父路径下选择其子文件
        File f4 = new File(f2,"TestFile666.java");
        File f5 = new File("c:/Code/java/aa/bb/cc/dd");
        try {
            f4.createNewFile();//创建空文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        f4.delete();//删除该文件

        f5.mkdirs();//创建复数目录时使用

        if (f.isFile()){
            System.out.println("是一个文件");
        }

        if (f2.isDirectory()){
            System.out.println("是一个目录");
        }
        System.out.println(f.getName());
        System.out.println(f.getPath());
    }
}
