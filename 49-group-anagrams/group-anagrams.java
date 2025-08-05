class Solution {

    private String getkey(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

         for (int j = 0; j < s.length(); j++) {
             freq[s.charAt(j) - 'a']++;
         }

         for (int i = 0; i < freq.length; i++) {
            sb.append("-"+freq[i]);
         }

        return sb.toString(); 
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String key = getkey(strs[i]);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>(Arrays.asList(strs[i])));
            } else {
                ArrayList<String> val = map.get(key);
                val.add(strs[i]);
                map.put(key, val);
            }
        }

        return new ArrayList(map.values());
    }
}