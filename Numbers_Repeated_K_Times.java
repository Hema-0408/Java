//Numbers Repeated K Times
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == K) {
                ans.add(key);
            }
        }
        if (ans.size() == 0) {
            System.out.print("-1");
            return;
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i != ans.size() - 1) System.out.print(" ");
        }
    }
}
