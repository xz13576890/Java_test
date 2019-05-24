package Test_Data_Expression.Tokenization;


public class MySimpleTokenizer extends Tokenizer {

    private String text;
    private int pos;
    private Object current;

    static final char whitespace[] = {' ', '\n', '\t'};
    static final char symbol[] = {'(', ')', '=', ':', '?', ',', '*', '+'};

    public MySimpleTokenizer(String text) {
        this.text = text;
        this.pos = 0;
        next();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object current() {
        return current;
    }

    @Override
    public void next() {
        consumeWhite();
        if (pos == text.length()) { //光标到最后
            current = null;
        } else if (isin(text.charAt(pos), symbol)) { //属于特殊符号
            current = "" + text.charAt(pos);
            pos++;
        } else if (Character.isDigit(text.charAt(pos))) { //属于数字
            int start = pos; //记录起始位置
            while (pos < text.length() && Character.isDigit(text.charAt(pos))) {
                pos++;
            }
            if (pos + 1 < text.length() && text.charAt(pos) == '.' &&
                    Character.isDigit(text.charAt(pos + 1))) { //发现小数点
                pos++;
                while (pos < text.length() && Character.isDigit(text.charAt(pos))) {
                    pos++;
                }
                current = Double.parseDouble(text.substring(start, pos));//此为小数
            } else {
                current = Integer.parseInt(text.substring(start, pos));//没发现则为整数
            }
        } else { //属于文本
            int start = pos;
            while (pos < text.length() && !isin(text.charAt(pos), symbol) &&
                    !isin(text.charAt(pos), whitespace)) {
                pos++;
            }
            current = text.substring(start, pos);
        }

    }

    //skip whitespace
    private void consumeWhite() {
        while (pos < text.length() && isin(text.charAt(pos), whitespace))
            pos++;
    }

    //判定是否是属于特殊符号
    private boolean isin(char c, char charlist[]) {
        for (char w : charlist) {
            if (w == c)
                return true;
        }
        return false;
    }

}
