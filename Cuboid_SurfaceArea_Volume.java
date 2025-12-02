//Cuboid Surface Area and Volume
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        System.out.print(2*((l*b)+(l*h)+(b*h))+" ");
        System.out.print(l*b*h);
    }
}