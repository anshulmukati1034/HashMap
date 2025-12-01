import java.util.HashMap;
import java.util.Map;

public class Q10_MaximumNumberofBalloons {
    public static int maxNumberOfBalloons(String text) {

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Count how many "balloon" we can make
        int b = freq.getOrDefault('b', 0);
        int a = freq.getOrDefault('a', 0);
        int l = freq.getOrDefault('l', 0) / 2; // needs 2
        int o = freq.getOrDefault('o', 0) / 2; // needs 2
        int n = freq.getOrDefault('n', 0);

        // Step 3: Answer is minimum of all
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text)); // Output: 2
    }
}
