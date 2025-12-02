//Print Integer Digits
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = Long.toString(n);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i < s.length() - 1)
                System.out.print(" ");
        }
    }
}
