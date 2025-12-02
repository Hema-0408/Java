//Odd or Even Checker
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        long rounded = Math.round(x);
        if (rounded == 0) {
            System.out.print("Zero");
        } 
        else if (rounded % 2 == 0) {
            System.out.print("Even");
        } 
        else {
            System.out.print("Odd");
        }
    }
}
