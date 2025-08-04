class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] min = nums1.length >= nums2.length ? nums2 : nums1;
        int[] max = nums1.length >= nums2.length ? nums1 : nums2;
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < min.length; i++) {
            s.add(min[i]);
        }

        for (int i = 0; i < max.length; i++) {
            if (res.contains(max[i])) continue;
            if (s.contains(max[i])) res.add(max[i]);

        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}