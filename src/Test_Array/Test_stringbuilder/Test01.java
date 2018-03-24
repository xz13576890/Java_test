package Test_Array.Test_stringbuilder;

/**
 * 测试可变字符序列：StringBuilder(线程不安全，效率高),StringBuffer(线程安全,效率低)
 * 主要使用append方法拓展字符串,以及数组扩容,详见append源码
 */
public class Test01 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();//字符数组长度初始为16
        StringBuilder sb1 = new StringBuilder(32);//字符数组长度初始为32
        StringBuilder sb2 = new StringBuilder("abcd");//字符数组长度初始为4+默认的16=20,value[]={'a','b','c','d',\u0000,\u0000.....}
        sb2.append("efg");//在“abcd"后加上“edf"
        sb2.append(true);//相当于+”ture“
        System.out.println(sb2);
        sb2.append(false).append(321).append("随便");//通过append源码中的”return this“实现方法链

        System.out.println("######################");

        StringBuilder gh = new StringBuilder("a");//这里只有两个对象.数组长度=1+16=17
        for (int i = 0; i < 20 ; i++){ //append方法在数组长度不够时通过老数组长度×2+2建立一个新数组来扩容，还不够就继续新建
            gh.append(i);//使用append方法增加字符串内容可以不用新建许多对象
        }
        System.out.println(gh);





    }
}
