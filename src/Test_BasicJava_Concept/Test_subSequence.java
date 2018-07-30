package Test_BasicJava_Concept;

import java.util.ArrayList;

public class Test_subSequence {
    public static void main(String[] args) {
        String a = "abcdeffgrjkldef";
        int length = a.length();
        String b;
        String c;
        String d = "";

        System.out.println(d.length());

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();


        System.out.println(a.subSequence(0, 2));
        System.out.println(a.subSequence(3, 5));
        System.out.println(a.subSequence(6, 8));

        //截取字符串中特定位置的字符段作为新数组（每3个字符一组）
        for (int i = 0; i < length; i += 3) {
            b = (String) a.subSequence(i, i + 3);
            al.add(b);
        }
        System.out.println(al);

        //截取字符串中特定位置的字符段作为新数组（每3个字符中的前两个一组）
        for (int i = 0; i < length; i += 3) {
            c = (String) a.subSequence(i, i + 2);
            al2.add(c);
        }
        System.out.println(al2);
        System.out.println("#########################");

        //通过逐一遍历检查新数组al中是否有重复元素，有一个就打一个true
        for (int j =0;j<al.size();j++){
            for (int i =j+1;i<al.size();i++){
                if (al.get(j).equals(al.get(i))){
                    System.out.println(true);
                }
            }
        }
        System.out.println("#########################");

        //通过逐一遍历检查原字符串间隔相同距离的字符是否有重复，有一个就打一个true
        for (int j = 2;j<length;j+=3){
            for (int i =j+3;i<length;i+=3){
                if (a.charAt(j)==a.charAt(i)){
                    System.out.println(true);
                }
            }
        }

    }


}
