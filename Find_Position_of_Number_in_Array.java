//Find Position of Number in Array
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int found=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==k)
            {
                found=1;
                System.out.print(i+1);
                break;
            }
        }
        if(found==0)
        {
            System.out.print(-1);
        }
    }
}