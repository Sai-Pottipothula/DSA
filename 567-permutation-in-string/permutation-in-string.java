class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //frequency map for s1 (char, count).
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // move sliding window over s2
        Map<Character, Integer> map2 = new HashMap<>();
        int i=0;
        for(int j=0;j<s2.length();j++){
            char ch = s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
            if(j-i+1 > s1.length()){
                char left = s2.charAt(i);
                map2.put(left, map2.get(left) - 1);
                if(map2.get(left) == 0) map2.remove(left);
                i++;
            }
            if(j-i+1 == s1.length() && map.equals(map2)) return true;
        }
        return false;
    }
}
