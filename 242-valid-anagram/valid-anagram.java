class Solution {
    
    private HashMap<Character, Integer> characterFreq(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!freqMap.containsKey(s.charAt(i))) {
                freqMap.put(s.charAt(i), 1);
            } else {
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i))+1);
            }
        }
        return freqMap;
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m1 = characterFreq(s.trim());
        HashMap<Character, Integer> m2 = characterFreq(t.trim());

        if (s.length() != t.length()) return false;

        for (Map.Entry<Character, Integer> entry: m1.entrySet()) {

            if (!m2.containsKey(entry.getKey())) return false;

            if (entry.getValue().intValue() != m2.get(entry.getKey()).intValue()) {

                return false;
            };

        }

        return true;
    }
}