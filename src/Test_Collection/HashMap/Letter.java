package Test_Collection.HashMap;

/**
 * javabean 存储数据 po bo vo 即包含setter与getter访问器的类
 */
public class Letter {
    private String name; //单词名
    private int count; //单词次数

    public Letter() {

    }

    public Letter(String name) {
        this.name = name;
    }

    public Letter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
