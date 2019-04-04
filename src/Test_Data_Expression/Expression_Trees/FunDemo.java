package Test_Data_Expression.Expression_Trees;

//用一棵tree来储存表达式
public class FunDemo {

    public static void main(String[] args) {

        Subs subs = new Subs();
        //组成表达式（3 * 4）+ 5
        Exp e = new AddExp(new MultExp(new LitExp(3),new LitExp(4)),new LitExp(5));
        System.out.println(e.show() + " value is " + e.evaluate(subs));

        //组成表达式（3 * 4）+ （5 * x）
        subs.put("x",0);
        Exp e2 = new AddExp(new MultExp(new LitExp(3),new LitExp(4)),
                new MultExp(new LitExp(5),new VarExp("x")));
        System.out.println(e2.show() + " value is " + e2.evaluate(subs));


    }
}
