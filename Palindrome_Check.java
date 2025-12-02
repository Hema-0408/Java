//Palindrome Check
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}