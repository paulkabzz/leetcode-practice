import java.util.*;


class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= 1) s.add(nums[i]);
       }

       System.out.println(s);

       for (int i = 1; i <=  s.size() + 1; i++) {
            // System.out.println(i);
            if (!s.contains(i)) return i;
       }

       return 1;
    }
}