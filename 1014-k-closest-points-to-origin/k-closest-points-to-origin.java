class Solution {

// Overall Time Complexity: O(nlogn)
// Space Complexity: O(n) extra space

    private double getDist(int[] point) {
        double x = Math.pow((point[0]), 2);
        double y = Math.pow((point[1]), 2);
        return  Math.sqrt(x+y);
    }

    private int[] toIntArr(String[] s) {
        int[] res = new int[s.length - 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(s[i]);
        }

        return res;
    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];

        Map<String, Double> m = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int[] key = {points[i][0], points[i][1], i}; 
            m.put(Arrays.toString(key), getDist(points[i]));
        }

        PriorityQueue<Map.Entry<String, Double>> q = new PriorityQueue<>(
            Comparator.comparingDouble(Map.Entry::getValue)
        );

        q.addAll(m.entrySet());

        for (int i = 0; i < k; i++) {
            String p = q.poll().getKey();
            res[i] = toIntArr(p.substring(1, p.length() - 1).split(", "));
        }

        return res;
    }
}