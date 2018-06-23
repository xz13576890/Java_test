package Test_Generic;

/**
 * 自定义泛型类的使用，在声明的同时指定具体的类型
 * 不能是8种基本类型，必须是引用类型
 */
public class MyStuApp {

    public static void main(String[] args) {
        MyStudent<Integer> stu = new MyStudent<>();
        //1、安全：类型检查
//        stu.setJavase("优秀");
        stu.setJavase(80);
        //2、省心：自动类型转换，免去了类型检查
        Integer score = stu.getJavase();

    }
}

