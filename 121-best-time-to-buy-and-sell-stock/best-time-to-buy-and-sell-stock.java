class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int Profit;
        int maxProfit=0;
        for(int j=i+1;j<prices.length;j++){
            if(prices[i]<prices[j]){
                Profit=prices[j]-prices[i];
                maxProfit=Math.max(Profit, maxProfit);
            }
            else{
                i=j;
            }
        }
        return maxProfit;
    }
}