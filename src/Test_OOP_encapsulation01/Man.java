package Test_OOP_encapsulation01;

public class Man {
    private String name;
    private String id;
    public static int cc;
    public static final int MAX_SPEED = 120;
    private boolean man;

    public String getName() { //getName方法 可用Code-Generate 来自动生成
        return name;
    }

    public void setName(String name) {  //setName方法
        this.name = name;
    }


    public boolean isMan() { //boolean 用is来表示
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
