class Solution {
    public int longestConsecutive(int[] nums) {
        // Kinda hacky - O(m*logm) where m is the size of the set
        Set<Integer> s = new HashSet<>();
        int longest = 0;
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }

        Object[] arr = s.toArray();
        nums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = (int) arr[i];
        }

        Arrays.sort(nums);

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) count++;
            else
                count = 1;
            longest = Math.max(count, longest);
        }

        return longest;
    }
}