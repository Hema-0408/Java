//Count Element Occurrences
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
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(k==arr[i])
            {
                count++;
            }
        }
        if(count>0){
        System.out.print(count);
        }
        else
        {
            System.out.print(-1);
        }
    }
}