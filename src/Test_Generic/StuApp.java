package Test_Generic;

/**
 * 没有泛型的类存储数据，很麻烦
 */
public class StuApp {

    public static void main(String[] args) {
        //存入整数int——Integer——Object
        Student stu = new Student(80);

        Object javase = stu.getJavase();

        //类型检查 处理转换异常
        if (javase instanceof Integer){
            Integer javaseScore = (Integer)javase;
        }

        stu = new Student("优秀");


    }
}
