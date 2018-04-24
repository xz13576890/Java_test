package Test_OOP.Test_OOP_polymorphism;

public class Test {


    public static void testAnimalVoice(Animal c){ //Using Animal as the father class so that all the son class can be included
        c.voice();
        if (c instanceof Cat){  //如果c是Cat的对象，返回boolean值
            ((Cat) c).catchMouse();
        }
    }
    /*
    public static void testAnimalVoice(Dog c){
        c.voice();
    }

    public static void testAnimalVoice(Frog c){
        c.voice();
    }
    */
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        Animal c = new Frog();
        Animal d = new Animal();

        //Cat c = new Cat();
        //testAnimalVoice(c);

        testAnimalVoice(a);
        testAnimalVoice(b);
        testAnimalVoice(c);
        testAnimalVoice(d);
        /*
        a.catchMouse(); //没有转型为Cat类编译器找不到该方法
        */

        //Cat a2 = (Cat)a;//强制转型
        //a2.catchMouse();

    }

}
