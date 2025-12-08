//Sorted Elements Less Than K
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tokens = new ArrayList<>();
        while (sc.hasNextInt()) {
            tokens.add(sc.nextInt());
        }
        sc.close();
        if (tokens.size() < 2) {
            System.out.print("-1");
            return;
        }
        int N = tokens.get(0);
        int K = tokens.get(1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i < tokens.size() && arr.size() < N; i++) {
            arr.add(tokens.get(i));
        }
        ArrayList<Integer> less = new ArrayList<>();
        for (int x : arr) {
            if (x < K) less.add(x);
        }
        if (less.isEmpty()) {
            System.out.print("-1");
            return;
        }
        Collections.sort(less);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < less.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(less.get(i));
        }
        System.out.print(sb.toString());
    }
}
