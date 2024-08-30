import java.util.*;
public class  long_unique_substring{
    public static boolean unique(String s, char ch) {
        return s.contains(ch+"");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = in.next();
        int n = s.length();
        String st = "";
        int l = 0, r = 0, max = 0;
        while (r < n) {
            char ch = s.charAt(r);
            st += ch;
            if (unique(st, ch)) {
                st = st.substring(l);
                l++;
            } else 
                max = Math.max(max, r - l + 1);
            r++;
        }

        System.out.println("Length of max unique substring = " + max);
    }
}
