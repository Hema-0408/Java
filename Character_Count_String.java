//Character Count in String
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=sc.next().charAt(0);
        int found=0;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                found=1;
                count++;
            }
        }
        if(found==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(count);

        }
    }
}