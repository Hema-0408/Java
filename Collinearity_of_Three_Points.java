//Collinearity of Three Points
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1))
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
