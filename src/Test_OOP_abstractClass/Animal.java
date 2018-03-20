package Test_OOP_abstractClass;

public abstract class Animal { //包含了抽象方法的类一定是抽象类
    String str;  //抽象方法中仍然可以定义普通属性和方法

    public abstract void run();//抽象方法必须被子类重写从而成为一种规范子类的模板

    public abstract void eat();//抽象方法必须被子类重写从而成为一种规范子类的模板

    public void breath(){ //抽象方法中仍然可以定义普通属性和方法
        System.out.println("Inhaling!!");
        run();  //由于多态的存在实际调用时必定是子类的对象调用其重写过的方法，所以抽象方法也能在类中调用
    }

    public Animal(){
        System.out.println("Create an Animal!");
    }

}

class Cat extends Animal{

    @Override
    public void run() { //抽象方法必须被子类声明实现
        System.out.println("Cat Run!!");

    }

    @Override
    public void eat() {

    }
}

class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("Dog Run!!");
    }

    @Override
    public void eat() {

    }
}