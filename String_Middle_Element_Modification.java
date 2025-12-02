//String Middle Element Modification
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        if(len%2!=0)
        {
            for(int i=0;i<len;i++)
            {
                if(i==len/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(str.charAt(i));
                }
            }
        }
        if(len%2==0)
        {
            for(int i=0;i<len;i++)
            {
                if(i==len/2 || i==(len/2)-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}