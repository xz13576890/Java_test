package Test_Data_Expression.Expression_Trees;

/**
 * 变量“x”类
 */
public class VarExp extends Exp {
    String name;

    public VarExp(String name) {
        this.name = name;
    }

    @Override
    public String show() {
        return "" + name;
    }

    @Override
    public int evaluate(Subs subs) {

        return subs.get(name);
    }
}
