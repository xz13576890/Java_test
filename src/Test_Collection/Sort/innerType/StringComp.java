package Test_Collection.Sort.innerType;

import java.util.Comparator;

/**
 * 排序规则的业务类
 */
public class StringComp implements Comparator<String> {
    /**
     * 按字符长度比较大小
     * 返回：正数（大于）；负数（小于）；零（相等）
     */
    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        //Collections调用时是升序还是降序由这里的正负决定
        return -(len1 - len2);
    }
}
