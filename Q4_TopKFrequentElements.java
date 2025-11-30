import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4_TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency using HashMap
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>()); // initialize each bucket
        }

        // Fill buckets
        for (int key : freq.keySet()) {
            int f = freq.get(key);
            buckets.get(f).add(key);
        }

        // Step 3: Take top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = nums.length; i >= 0 && index < k; i--) {
            for (int num : buckets.get(i)) {
                result[index++] = num;
                if (index == k) return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topK = topKFrequent(nums, k);
        
        System.out.print("Top " + k + " frequent elements: ");
        for (int num : topK) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
