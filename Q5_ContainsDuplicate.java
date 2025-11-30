import java.util.HashSet;

public class Q5_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true;  // duplicate found
            }
            set.add(n);
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Array 1 contains duplicates: " + containsDuplicate(nums1)); // true
        System.out.println("Array 2 contains duplicates: " + containsDuplicate(nums2)); // false
    }
}
