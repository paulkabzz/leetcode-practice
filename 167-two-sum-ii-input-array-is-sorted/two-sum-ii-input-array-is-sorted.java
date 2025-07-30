class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // for (int i = 0; i < numbers.length; i++) {
        //     int compl = target - numbers[i];

        //     for (int j = 0; j < numbers.length; j++) {
        //         if (numbers[j] == compl && i != j) return new int[] {i+1, j+1};
        //     }
        // }

        int i = 0;
        int j = numbers.length -1;

        while (i < j) {
            if (numbers[j] +  numbers[i] == target) {
                return new int[] {i+1, j+1};
            }
            if ((numbers[j] + numbers[i]) > target) {
                j--;
            } else i++;
        }

        return new int[] {0, 0};
    }
}