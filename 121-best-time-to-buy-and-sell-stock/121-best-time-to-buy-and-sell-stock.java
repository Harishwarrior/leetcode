class Solution {
    public int maxProfit(int[] prices) {
        int brought=prices[0];
        int ans=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>brought ){
                if(ans<(prices[i]-brought)){
                    ans=prices[i]-brought;
                }
            }else{
                brought=prices[i];
            }
        }
        
       
        return ans;
        
        
        
    }
}