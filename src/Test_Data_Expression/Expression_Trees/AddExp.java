package Test_Data_Expression.Expression_Trees;

public class AddExp extends Exp {

    Exp left, right;

    public AddExp(Exp left, Exp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String show() {
        return "(" + left.show() + " + " + right.show() + ")";
    }

    @Override
    public int evaluate(Subs subs) {
        return left.evaluate(subs) + right.evaluate(subs);
    }
}
