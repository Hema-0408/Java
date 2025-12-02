//Check if Number is Composite
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=3;i*i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");

        }
    }
}