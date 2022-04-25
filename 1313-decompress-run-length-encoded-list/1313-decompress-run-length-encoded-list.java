class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++){
                arr.add(nums[i+1]);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}