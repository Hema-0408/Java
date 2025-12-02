//Multiplication Table of 9
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("NULL");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(9 * i);
            if (i < n) System.out.print(" ");
        }
    }
}
