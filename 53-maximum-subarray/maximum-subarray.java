class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum=nums[0];
        int CurrSum=0;
        for(int i=0;i<nums.length;i++){
            if(CurrSum<0){
                CurrSum=0;
            }
            CurrSum+=nums[i];
            if(CurrSum>MaxSum){
                MaxSum=CurrSum;
            }
        }
        return MaxSum;
    }
}