package Test_OOP;

/**
 * 测试重载
 */
public class Test_Overload {
    public static void main(String[] args) {
        Mymath m = new Mymath();
        int result1 = m.add(4,5);
        int result2 = m.add(3,5,4);
        System.out.println(result1);
        System.out.println(result2);
    }
}

class Mymath{
    int a;
    int b;
    //overload 构造器constructor
    public Mymath(){
    }
    public Mymath(int a){
        this.a = a;
    }
    public Mymath(int b, int a){
        this.a = a;
        this.b = b;
    }

    //overload 普通Method
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }

}
