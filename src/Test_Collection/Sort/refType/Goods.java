package Test_Collection.Sort.refType;

/**
 * 商品实体类
 */
public class Goods {
    //商品名
    private String name;
    //收藏量
    private int fav;
    //价格
    private double price;

    public Goods() {
    }

    public Goods(String name, int fav, double price) {
        this.name = name;
        this.fav = fav;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "商品名" + name + ",收藏量：" + this.fav + "，价格：" + this.price + "\n";
    }
}
