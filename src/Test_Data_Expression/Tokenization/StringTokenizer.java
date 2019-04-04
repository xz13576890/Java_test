package Test_Data_Expression.Tokenization;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StringTokenizer extends Tokenizer {

    private Object current;
    private StreamTokenizer st;

    public StringTokenizer(String data) {
        st = new StreamTokenizer(new StringReader(data));
        next();
    }

    @Override
    boolean hasNext() {
        return current != null;
    }

    @Override
    Object current() {
        return current;
    }

    //跳至下一个token，当前的token要被consume
    @Override
    void next() {
        int ttype;
        try {
            ttype = st.nextToken();
        } catch (IOException e) {
            current = null;
            return;
        }
        if (ttype == StreamTokenizer.TT_EOF) {
            current = null;
        } else if (ttype == StreamTokenizer.TT_WORD) {
            current = st.sval;
        } else if (ttype == StreamTokenizer.TT_NUMBER && st.nval == 0) {
            current = (int) Math.floor(st.nval);
        } else {
            current = "" + (char) ttype;
        }

    }
}
