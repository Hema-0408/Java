//GCD of Two Numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 || b==0)
        {
            System.out.print(-1);
            return;
        }
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print(a);
        
    }
}