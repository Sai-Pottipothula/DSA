class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            //if entire searching space is sorted 
            if(nums[start]<=nums[end]){
                return nums[start];
            }

            int middle=start+(end-start)/2;
            if(middle >0 && nums[middle]<nums[middle-1]){
                return nums[middle];
            }

            //if left half is non sorted 
            if(nums[start]>nums[middle]){
                end=middle-1;
            }
            //if right half is non sorted 
            else{
                start=middle+1;
            }
        }
        return -1;
    }
}