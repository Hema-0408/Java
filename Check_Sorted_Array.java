//Check Sorted Array
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) asc = false;
            if (arr[i] > arr[i-1]) desc = false;
        }
        if (asc || desc)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
