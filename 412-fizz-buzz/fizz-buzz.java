class Solution {
    public List<String> fizzBuzz(int n) {
        String[] res = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) { // current index is divisible by 3
                res[i-1] = "Fizz";
                if (i % 5 == 0) res[i-1] = "FizzBuzz"; // current index is divisible by 3 & 5
            } else if (i % 5 == 0) res[i-1] = "Buzz"; //current index is divisible by 5 only
            else res[i-1] = Integer.toString(i); //Every other case unaccounted for
        }

        return new ArrayList(Arrays.asList(res)); // convert the array to a list and return it
    }
}