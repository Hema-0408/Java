//Second Smallest Element
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(arr[i]<first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        if(second==Integer.MAX_VALUE)
        {
        System.out.print(-1);
        }
        else
        {
            System.out.print(second);

        }
        
    }
}