package Test_commonClass.Test_File;

import java.io.File;

public class FileTree {
    public static void main(String[] args) {
        File f = new File("c:/Code/java/aa");
        printFile(f,0);
    }

    /**
     * 用树状图打印给定文件和层级下的所有目录及文件
     * @param file
     * @param level
     */
 static void printFile(File file,int level){
        for (int i = 0; i < level; i++){
            System.out.print("-");
        }
        System.out.println(file.getName());

        if (file.isDirectory()){ //如果file是目录，则继续下面的
            File[] files = file.listFiles();//因为是目录所以包含子目录，将其所有子目录列入数组
            for (File temp : files){ //遍历该数组
                printFile(temp,level+1);//递归调用
            }
        }


 }
}