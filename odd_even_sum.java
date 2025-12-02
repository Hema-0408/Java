//Odd or Even Sum
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if((num1+num2)%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
}