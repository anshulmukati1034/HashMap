import java.util.HashMap;

public class Q7_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If mapping already exists, check it
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) return false;
            } 
            else {
                map1.put(c1, c2);
            }

            // Reverse mapping
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) return false;
            } 
            else {
                map2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));  // true
    }
}
