package Test_Generic;

/**
 * PO类 JavaBean
 */
public class Student {
    //成绩
    private Object javase;

    public Student(){
    }

    public Student(Object javase) {
        this.javase = javase;
    }

    public Object getJavase() {
        return javase;
    }

    public void setJavase(Object javase) {
        this.javase = javase;
    }
}
