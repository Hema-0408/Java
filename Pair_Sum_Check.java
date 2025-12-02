//Pair Sum Check
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    found=true;
                    break;
                }
            }
        }
        if(found)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}