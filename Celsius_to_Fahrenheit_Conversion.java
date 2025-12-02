//Celsius to Fahrenheit Conversion
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.printf("%.2f", f);
    }
}
