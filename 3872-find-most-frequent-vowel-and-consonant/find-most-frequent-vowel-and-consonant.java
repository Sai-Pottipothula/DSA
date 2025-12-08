class Solution {
    public int maxFreqSum(String s) {
        // frequency of all values
        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0)+1);
        } 

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int maxV = 0;
        int maxC = 0;
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            char ch = entry.getKey();
            int cnt = entry.getValue();
            if(vowels.contains(ch)){
                maxV = Math.max(maxV, cnt);
            }
            else{
                maxC = Math.max(maxC, cnt);
            }
        }
        return maxV+maxC;
    }
}