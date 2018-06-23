package Test_Generic.Generic02;

import Test_Generic.MyStudent;

/**
 * 泛型的擦除：使用时、实现、继承父类时没有指定类型，类似于Object
 */
public class MyStuApp02 {

    public static void main(String[] args) {
        //擦除 -->没有指定泛型的具体类型
        MyStudent student = new MyStudent();//没有指定类型
        student.setJavase(100);
        Object obj = student.getJavase();

        test(student);//编译不会类型检查
        MyStudent<Object> student2 = new MyStudent<Object>();//指定具体类型
        //不等于Object
        //test(student2);//编译时会类型检查

    }

    public static void test(MyStudent<Integer> stu){

    }
}

