class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];

        for (int i = 0; i <m; i++) {
            merged[i] = nums1[i];
        }

        int j, k;
        for (j = 0, k = m; k < merged.length; k++, j++) {
            merged[k] = nums2[j];
        }

        Arrays.sort(merged);

        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }

    }
}