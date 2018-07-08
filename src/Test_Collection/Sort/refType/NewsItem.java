package Test_Collection.Sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻条目实体类
 * 包括：标题，点击量，时间
 */
public class NewsItem implements Comparable<NewsItem> {
    //标题
    private String title;
    //点击量
    private int hits;
    //时间
    private Date pubTime;

    public NewsItem() {
    }

    public NewsItem(String title, int hits, Date pubTime) {
        this.title = title;
        this.hits = hits;
        this.pubTime = pubTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    //先按时间降序+点击量升序+标题降序（自定义业务规则）
    @Override
    public int compareTo(NewsItem o) {
        int result = 0;
        //比较时间
        result = -this.pubTime.compareTo(o.pubTime);//降序
        if (result == 0) { //时间相同
            //点击量
            result = this.hits - o.hits;//升序
            if (result == 0) { //点击量相同
                //标题降序
                result = -this.title.compareTo(o.title);//降序
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("标题：").append(this.title);
        sb.append("，时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
        sb.append("，点击量：").append(this.hits).append("\n");
        return sb.toString();
    }
}
