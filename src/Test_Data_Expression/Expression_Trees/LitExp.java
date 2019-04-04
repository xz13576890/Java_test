package Test_Data_Expression.Expression_Trees;

public class LitExp extends Exp {
    int value;

    public LitExp(int value) {
        this.value = value;
    }

    @Override
    public String show() {
        return "" + value;
    }

    @Override
    public int evaluate(Subs subs) {
        return value;
    }
}
