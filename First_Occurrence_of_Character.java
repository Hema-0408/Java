// First Occurrence of Character
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=sc.next().charAt(0);
        int found=-1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                found=i+1;
                break;
            }
        }
        System.out.print(found);
    }
}