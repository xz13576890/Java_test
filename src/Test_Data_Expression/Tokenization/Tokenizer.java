package Test_Data_Expression.Tokenization;

import java.text.ParseException;

public abstract class Tokenizer {

    abstract boolean hasNext();

    abstract Object current();

    abstract void next();

    public void parse(Object o) throws ParseException {
        if (current() == null || !current().equals(o))
            throw new ParseException("Not exist",404);
        next();
    }

    public boolean currentis(Object o) {
        return (current() != null && current().equals(o));
    }


}
