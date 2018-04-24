package Test_OOP.Test_OOP_nestedClasses;

public class OuterClass {

    public static void main(String[] args) {

        Face f = new Face();
        Face.Nose n = f.new Nose();
        n.breath();
        Face.Ear e = new Face.Ear();//静态内部类可以直接调用
        e.listen();
    }


}
class Face{
    int type = 20;
    String shape = "Round face";
    static  String colour = "red";

    class Nose{
        String type;

        void breath(){
            System.out.println(shape);
            System.out.println(type); //String [type](code row No.21) belongs to inner class [Nose]
            System.out.println(Face.this.type);//int [type](code row No.17) belongs to outer class [Face]
            System.out.println("Breath!");
        }
    }

    static class Ear{
        void listen(){
            System.out.println(colour);//外部类的静态属性静态内部类可以直接调用
            System.out.println("I am listening");
        }
    }
}