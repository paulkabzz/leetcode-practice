class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (frequencyMap.containsKey(nums[i])) {
                frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
            } else frequencyMap.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            if (entry.getValue() > Math.floor(nums.length/3)) res.add(entry.getKey());
        }

        return res;
    }
}