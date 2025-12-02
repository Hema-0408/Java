//Number Existence Check
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[size];
        int found=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]==k)
            {
                found=1;
                break;
            }
        }
        if(found==0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");

        }
    }
}