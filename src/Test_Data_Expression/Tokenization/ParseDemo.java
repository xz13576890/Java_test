package Test_Data_Expression.Tokenization;



public class ParseDemo {

    static String e1 = "2 * 14 + 2";
    static String e2 = "(2 * 44) + 2";

    public static void main(String[] args) {
        Tokenizer t = new MySimpleTokenizer(e1);

    }

}
