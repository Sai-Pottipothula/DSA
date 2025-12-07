
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int[] arr = {-1,-1};
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m] < target) l = m+1;
            else if(nums[m] > target) r = m-1;
            else{
                arr[0] = m;
                r = m-1;
            }
        }
        l = 0;
        r = nums.length-1;
         while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m] > target) r = m-1;
            else if(nums[m] < target) l = m+1;
            else{
                arr[1] = m;
                l = m+1;
            }
        }
        return arr;
    }
}