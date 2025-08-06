class Solution {
    private int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int l = m +n;
        int[] arr = new int[l];

        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }

        int j, k;

        for (k = n, j = 0; k < l; k++, j++) {
            arr[k] = nums2[j];
        }

        Arrays.sort(arr);

        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
        int middle = merged.length/2;

        if ((merged.length % 2) == 0) {
            int m = (int) middle;
            double a = (double) merged[m - 1];
            double b =  (double) merged[m];
            return ( a + b) /2;
        } 

        return merged[middle];
    }
}