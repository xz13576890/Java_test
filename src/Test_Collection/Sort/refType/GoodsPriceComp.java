package Test_Collection.Sort.refType;

import java.util.Comparator;

/**
 * 按价格排序的业务类（降序）
 */
public class GoodsPriceComp implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        //因为price是double直接加减不是int，所以用三元运算符处理
        //若>0返回-1表示降序，Collections.sort()默认为升序
        return o1.getPrice() - o2.getPrice() > 0 ? -1 : (o1.getPrice() == o2.getPrice() ? 0 : 1);
    }
}
