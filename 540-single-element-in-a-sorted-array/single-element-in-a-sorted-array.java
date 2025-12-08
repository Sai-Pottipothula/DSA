class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int middle = start + (end-start)/2;

            if(middle%2!=0){
                middle--;
            }

            if(nums[middle] == nums[middle+1]){
                start = middle+2;
            }
            else{
                end = middle;
            }
        }
        return nums[start];
    }
}