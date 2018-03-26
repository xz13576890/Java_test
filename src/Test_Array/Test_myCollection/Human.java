package Test_Array.Test_myCollection;

public class Human {
    private String name;

    Human(String name) { //不加修饰符即为默认，同一个包中皆可调用
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
