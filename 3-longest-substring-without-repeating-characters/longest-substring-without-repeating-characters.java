class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int left = 0;
        Set<Character> mySet = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(mySet.contains(s.charAt(right))){
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(s.charAt(right));
            maxCount = Math.max(maxCount, right-left+1);
        }
        return maxCount;
    }
}