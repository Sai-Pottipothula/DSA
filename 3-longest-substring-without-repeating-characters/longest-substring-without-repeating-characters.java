class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=i){
                i = map.get(s.charAt(j))+1;
            }
            int count = j-i+1;
            maxCount = Math.max(maxCount, count);
            map.put(s.charAt(j), j);
        }
        return maxCount;
    }
}