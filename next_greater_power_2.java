//Next Greater Power of 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int power=1;
        while(power<=n)
        {
            power*=2;
        }
        System.out.print(power);
    }
}