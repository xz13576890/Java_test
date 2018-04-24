package Test_OOP.Test_OOP_polymorphism;

public class Animal {
    String str;
    public void voice(){
        System.out.println("Normal voice!");
    }
}


class Cat extends Animal{
    @Override
    public void voice(){
        System.out.println("Meow! Meow! Meow!");
    }
    public void catchMouse(){
        System.out.println("Catch a mouse!!");
    }
}

class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("Wong! Wong! Wong!");
    }

    public void guardDuty(){
        System.out.println("Watch Dog!!");
    }
}

class Frog extends Animal{
    @Override
    public void voice(){
        System.out.println("Gua! Gua! Gua!");
    }
}

class Tiger extends Animal{
    @Override
    public void voice(){
        System.out.println("Aoowu! Aoowu! Aoowu!");
    }
}