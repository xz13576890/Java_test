package Test_Collection.Sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class GoodsApp {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods("老干妈香辣酱",2000,12.5));
        list.add(new Goods("王中王火腿肠",1000,16.8));
        list.add(new Goods("金钩扑克牌",500,4.8));
        list.add(new Goods("太太乐蘑菇精",100,12.5));
        System.out.println("排序前："+list);
        Collections.sort(list,new GoodsPriceComp());
        System.out.println("按价格降序排序后："+list);
        Collections.sort(list,new GoodsFavComp());
        System.out.println("按收藏量升序排序后："+list);



    }
}
