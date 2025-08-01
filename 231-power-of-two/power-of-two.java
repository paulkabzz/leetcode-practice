class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0 || n < 0) return false;
        double pow = Math.floor(Math.log(n)/Math.log(2));
       return Math.pow(2, pow) == n;
    }
}