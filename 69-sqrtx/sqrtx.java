class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int start = 2;
        int end = x/2;
        while(start<=end){
            int middle = start + (end-start)/2;
            long sqr = (long) middle * middle;
            if(x==sqr){
                return middle;
            }
            else if(x<sqr){
                end=middle-1;
            }
            else{
                start=middle+1;
            } 
        }
        return end;
    }   
}
