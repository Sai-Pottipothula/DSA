class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int right=0;right<k;right++){
            sum=sum+nums[right];
        }
        double average = sum/k;
        for(int right=k;right<nums.length;right++){
            sum = sum + nums[right]- nums[right-k];
            average = Math.max(average, sum/k);
        }
        return average;
    }
}