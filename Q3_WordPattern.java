import java.util.HashMap;
import java.util.HashSet;

public class Q3_WordPattern {
      public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;}

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;}
            } else {
                if (seenWords.contains(w)) {
                    return false;}
                charToWord.put(c, w);
                seenWords.add(w);}}
        return true;
    }

     public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";

        System.out.println(pattern1 + " | " + s1 + " => " + wordPattern(pattern1, s1)); // true
        System.out.println(pattern2 + " | " + s2 + " => " + wordPattern(pattern2, s2)); // false
    }
}
