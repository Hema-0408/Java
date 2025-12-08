//Remove Characters from String
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        Set<Character> set = new HashSet<>();
        for (char c : S2.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : S1.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c);
            }
        }
        if (result.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result.toString());
        }
    }
}
