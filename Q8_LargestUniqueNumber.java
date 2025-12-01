import java.util.HashMap;
import java.util.Map;

public class Q8_LargestUniqueNumber {
    public static int largestUniqueNumber(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int largest = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) {
                largest = Math.max(largest, key);
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        System.out.println(largestUniqueNumber(nums));  // Output: 8
    }
}
