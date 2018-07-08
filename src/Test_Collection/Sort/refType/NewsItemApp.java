package Test_Collection.Sort.refType;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用Collections
 * 按时间降序+点击量升序+标题降序（自定义业务规则）
 */
public class NewsItemApp {

    public static void main(String[] args) {
        List<NewsItem> news = new ArrayList<>();
        news.add(new NewsItem("马里兰州核电站四号机组爆炸！", 50, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
        news.add(new NewsItem("中国登上月球！", 100, new Date()));
        news.add(new NewsItem("平行时空被发现！", 60, new Date(System.currentTimeMillis() - 1000 * 60 * 60)));
        System.out.println("排序前：" + news);

        //排序
        Collections.sort(news);//
        System.out.println("排序后" + news);

    }
}
