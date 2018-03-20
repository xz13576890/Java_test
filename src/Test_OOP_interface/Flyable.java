package Test_OOP_interface;

public interface Flyable {
    int MAX_SPEED = 11200;
    int MIN_HEIGHT = 1;
    /*public abstract*/ void fly();//一定是抽象方法
}

interface Attack{
    void attack();

}

class plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Plane using engine to fly!");
    }
}

class Man implements Flyable{

    @Override
    public void fly() {
        System.out.println("Man can jump to fly!");
    }
}

class Stone implements Flyable,Attack{ //可实现多个接口

    int weight;

    @Override
    public void fly() {
        System.out.println("Stone can be thrown to fly!");
    }

    @Override
    public void attack() {
        System.out.println("Stone can attack!");

    }
}