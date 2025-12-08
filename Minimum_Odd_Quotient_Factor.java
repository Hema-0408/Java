//Minimum Odd Quotient Factor
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int f = 1; f <= n; f++) {
            if (n % f == 0) {
                int q = n / f;
                if (q % 2 == 1) {
                    System.out.print(f);
                    return;
                }
            }
        }
    }
}
