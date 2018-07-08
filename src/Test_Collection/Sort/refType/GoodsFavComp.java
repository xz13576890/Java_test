package Test_Collection.Sort.refType;

import java.util.Comparator;

/**
 * 按收藏量排序的业务类（升序）
 */
public class GoodsFavComp implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        //Collections.sort()默认为升序，加上fav是int所以可以直接加减
        return o1.getFav()-o2.getFav();
    }
}
