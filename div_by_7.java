//Check Divisibility by 7
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%7==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");

        }
    }
}