class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> f = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (f.containsKey(nums[i])) {
                f.put(nums[i], f.get(nums[i]) + 1 );
            } else {
                f.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: f.entrySet()) {
            if (entry.getValue() < 2) return entry.getKey();
        }

        return 0;
    }
}