class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length-k;

        while(l<r){
            int m = l + (r-l)/2;
           if (arr[m + k] - x < x - arr[m]){
                l = m+1;
            }
            else{
                r = m;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i=l; i<l+k;i++){
            result.add(arr[i]);
        }

        return result;
    }
}