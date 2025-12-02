//Nth Term of Squares Series
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 0) {
            System.out.print("Error");
        } 
        else if(n == 0) {
            System.out.print(0);
        }
        else {
            System.out.print(n * n);
        }
    }
}
