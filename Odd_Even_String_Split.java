//Odd Even String Split
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(" ");
        for(int i=0;i<len;i++)
        {
            if(i%2!=0)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}