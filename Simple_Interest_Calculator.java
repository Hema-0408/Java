//Simple Interest Calculator
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double T = sc.nextDouble();
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100.0;
        System.out.printf("%.2f", SI);
    }
}
