//Vowel Check in String
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String vowel="aeiou";
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<vowel.length();j++)
            {
                if(str.charAt(i)==vowel.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");

        }
    }
}