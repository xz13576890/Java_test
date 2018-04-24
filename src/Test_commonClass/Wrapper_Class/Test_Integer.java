package Test_commonClass.Wrapper_Class;

public class Test_Integer {
    public static void main(String[] args) {
        Integer i = new Integer(1000); //强行把数字1000包装成Integer对象
        System.out.println(Integer.MAX_VALUE);//Integer对象默认最大值为+21亿
        System.out.println(Integer.toHexString(i));//将i转换为十六进制数
        Integer i2 = Integer.parseInt("234");//将字符串转化为int数字
        Integer i3 = new Integer("333");//直接用new转化字符串为数字

        System.out.println(i2 + 10);
        System.out.println(i2.intValue());//将Integer对象转换为int



    }
}
