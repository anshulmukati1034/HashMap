import java.util.HashMap;

public class Q6_LongestConsecutiveSequence {
     public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],false);
        }
        for(int key: hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
        }

        int max=0;

        for(int key: hm.keySet()){
            int k=1;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max=Math.max(max,k);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, -1, 1, 2, -2, 3};

        System.out.println("Longest consecutive sequence length in nums1: " + longestConsecutive(nums1)); // 4
        System.out.println("Longest consecutive sequence length in nums2: " + longestConsecutive(nums2)); // 6
    }
}
