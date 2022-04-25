class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int temp=0;
        int max=(nums[0]-1)*(nums[1]-1);
        for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
            temp=(nums[i]-1)*(nums[j]-1);
             if(temp>max){
                 max=temp;
             }
         } 
       }
        return max;
    }
}