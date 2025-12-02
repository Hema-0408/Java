//Product of Digits
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prod=1;
        while(num>0)
        {
            int digit=num%10;
            num=num/10;
            prod=prod*digit;
            
        }
        System.out.print(prod);
    }
}