class Solution {
    private int dist(int i, int j) {
        return Math.abs(i - j);
    }

    private boolean valid(ArrayList<Integer> a, int k) {
        int i, j;
        for (i = 0, j=1; j < a.size(); i++, j++) {
            if (dist(a.get(i), a.get(j)) <= k) return true;
        }

        return false;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        boolean dupe = false;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>(Arrays.asList(i)));
            } else {
                ArrayList<Integer> a = map.get(nums[i]);
                a.add(i);
                map.put(nums[i], a);
            }
        }


        for (Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
            ArrayList<Integer> a = entry.getValue();
            if (a.size() >= 2) {
                if (valid(a, k)) dupe = true;
            }
        }

        return dupe;
    }
}