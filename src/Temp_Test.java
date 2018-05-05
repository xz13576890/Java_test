import java.util.ArrayList;
import java.util.List;

public class Temp_Test {
    public static void main(String[] args) {
        String a = "abcdeffgrjklmnc";
        int length = a.length();
        String b;
        String c;
        String d = "";
        String f = null;
        System.out.println(f);
        System.out.println(d.length());

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();


        System.out.println(a.subSequence(0, 2));
        System.out.println(a.subSequence(3, 5));
        System.out.println(a.subSequence(6, 8));


        for (int i = 0; i < length; i += 3) {
            b = (String) a.subSequence(i, i + 3);
            al.add(b);
        }

        System.out.println(al);

        for (int i = 0; i < length; i += 3) {
            c = (String) a.subSequence(i, i + 2);
            al2.add(c);
        }
        System.out.println(al2);
        


/*
        for (int j =0;j<al.size();j++){
            for (int i =j+1;i<al.size();i++){
                if (al.get(j).equals(al.get(i))){
                    System.out.println(true);
                }
            }
        }
        */
/*
        for (int j = 2;j<length;j+=3){
            for (int i =j+3;i<length;i+=3){
                if (a.charAt(j)==a.charAt(i)){
                    System.out.println(false);
                }

            }
        }
        */

    }

    static boolean yy (String a){
        if (a.length() > 2) {
            return true;
        } else {
            return false;
        }
    }

}
