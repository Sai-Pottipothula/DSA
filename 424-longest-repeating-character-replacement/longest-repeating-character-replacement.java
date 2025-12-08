class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, maxLen = 0, maxFreq = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j=0; j<s.length();j++){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(c));
            while((j-i+1) - maxFreq > k){
                char ch = s.charAt(i);
                map.put(ch, map.get(ch)-1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}