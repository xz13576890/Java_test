package Test_OOP.Test_OOP_inheritance;

/**
 * 测试组合 组合即把父类作为一个属性放在子类中
 */
public class Animal2 {
    String eyes;

    public void run(){
        System.out.println("RUN!!");
    }
    public void eat(){
        System.out.println("EAT!!");
    }
    public void sleep(){
        System.out.println("zZZZZ!!");
    }

    public Animal2(){
        super();//若构造方法第一行代码没有显式地调用super（），则Java系统会默认调用super（）作为父类的初始化函数
        System.out.println("Create an Animal!");

    }

    public static void main(String[] args) {
        Reptiles2 r = new Reptiles2();
        r.run();
        r.animal2.eat();

    }

}

class Mammal2 {
    Animal2 animal2 = new Animal2();  //把继承替换为组合，即把Animal2作为一个属性放在子类中

    public void taisheng(){
        System.out.println("I am viviparous!!");

    }

}

class Reptiles2  {
    Animal2 animal2 = new Animal2();  //把继承替换为组合，即把Animal2作为一个属性放在子类中


    public void run(){
        animal2.run();
        System.out.println("Crawl!!");

    }


    public void eggSheng(){
        System.out.println("I am Oviparous!!");
    }

    public Reptiles2(){
        super();
        System.out.println("Create a Reptile!! ");
    }

}
