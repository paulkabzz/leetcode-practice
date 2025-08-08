class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j, k;
        for (j = 0, k = m; k < nums1.length; k++, j++) {
            nums1[k] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}