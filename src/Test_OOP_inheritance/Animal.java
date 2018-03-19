package Test_OOP_inheritance;

/**
 * 测试继承
 */

public class Animal /*extends Object*/{ //定义一个类时如果没有指定继承，则默认其父类是Object（Java中的根类）
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

    public Animal(){
        super();//若构造方法第一行代码没有显式地调用super（），则Java系统会默认调用super（）作为父类的初始化函数
        System.out.println("Create an Animal!");

    }

}

class Mammal extends Animal {  //Mammal扩展自Animal,所以以下部分跟Animal一样的内容就不用再写了
    /*
    String eyes;

    public void run(){
        System.out.println("RUN!!");
    }
    public void eat(){
        System.out.println("EAT!!");
    }
    */

    public void taisheng(){
        System.out.println("I am viviparous!!");

    }

}

class Reptiles extends Animal { //Reptiles扩展自Animal,所以以下部分跟Animal一样的内容就不用再写了

    /*
    String eyes;
    */

    @Override
    public void run(){
        System.out.println("Crawl!!"); //但这部分跟Animal有区别，所以可以重写（Override）
    }
    /*
    public void eat(){
        System.out.println("EAT!!");
    }
    */

    public void eggSheng(){
        System.out.println("I am Oviparous!!");
    }

    public Reptiles(){
        super();
        System.out.println("Create a Reptile!! ");
    }

}