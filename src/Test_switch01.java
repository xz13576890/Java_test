
public class Test_switch01 {
    public static void main(String[] args) {
        double d = Math.random();//返回一个[0,1)之间的小数
        int a = (int)(d*5);//返回一个[0,4]之间的整数
        int e = 1 + (int)(d*6);//构造一个六面骰子，即返回一个[1,6]之间的整数
        switch (e){
            case 6:
                System.out.println(e+" 运气真好！");
                break;
            case 5:
                System.out.println(e+" 运气还行。");
                break;
            case 4:
                System.out.println(e+" 运气一般。");
                break;
            default:
                System.out.println(e+" 运气不好！");
        }







        }
}
