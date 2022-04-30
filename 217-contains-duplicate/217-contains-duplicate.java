class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> storedValue = new HashSet<Integer> ();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(storedValue.add(nums[i])==false){
                return true;
            }
            
        }
        return false;
    }
}