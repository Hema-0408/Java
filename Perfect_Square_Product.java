//Perfect Square Product
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=a*b;
        int sq=(int)(Math.sqrt(prod));
        if(sq*sq==prod)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        
    }
}