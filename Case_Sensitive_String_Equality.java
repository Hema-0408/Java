//Case-Sensitive String Equality
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }
        boolean same = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                same = false;
                break;
            }
        }
        if (same)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
