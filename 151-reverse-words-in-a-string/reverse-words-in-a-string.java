class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            String temp = a[i];

            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        return String.join(" ", a).trim();
    }
}