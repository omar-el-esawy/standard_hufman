import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Map<String, Character> mp = new HashMap<String, Character>();
        for (int i = 0; i < n; i++) {
            char c = cin.next().charAt(0);
            String s = cin.next();
            mp.put(s, c);
        }
        String stream = cin.next(), orignal = "";
        int len = 0, l = 0;
        while (l < stream.length()) {
            len++;
            String cand = stream.substring(l, Math.min(l + len,stream.length()));
            if (mp.containsKey(cand)) {
                orignal += mp.get(cand);
                l += len;
                len = 0;
            }
        }

        System.out.println(orignal);
    }
}