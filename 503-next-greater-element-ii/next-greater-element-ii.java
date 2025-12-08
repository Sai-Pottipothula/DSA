class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        for(int i=0;i<2*n;i++){
            int curr = nums[i % n];
            while(!stack.isEmpty() && curr>nums[stack.peek()]){
                map.put(stack.pop(), curr);
            }
            if(i<n){
                stack.push(i);
            }
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.getOrDefault(i, -1);
        }
        return ans;
    }
}