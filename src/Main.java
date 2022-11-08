import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world";
        String[] ss;
        String sd = " ";
        ss = s.split(sd);
        System.out.print(Arrays.toString(ss));
       for (int i = 0; i<ss.length; i++){
           StringBuffer ch = new StringBuffer(ss[i]);
       }

    }
}