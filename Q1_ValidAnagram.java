import java.util.HashMap;
import java.util.Map;

public class Q1_ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease count using string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

  
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        String s3 = "rat";
        String s4 = "car";

        System.out.println(s1 + " & " + s2 + " → " + isAnagram(s1, s2)); // true
        System.out.println(s3 + " & " + s4 + " → " + isAnagram(s3, s4)); // false
    }
}
