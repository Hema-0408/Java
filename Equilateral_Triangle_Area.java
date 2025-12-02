//Equilateral Triangle Area
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area = (Math.sqrt(3) * a * a) / 4.0;
        System.out.printf("%.2f", area);
    }
}
