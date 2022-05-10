class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int maxProfit=0;
        int n=prices.length;
        while(r<n){
            if(prices[l]<prices[r]){
                int price=prices[r]-prices[l];
                if(price>maxProfit){
                    maxProfit=price;
                }
                
            }else{
                l=r;
            }
            r++;
        }
        return maxProfit;
    }
}