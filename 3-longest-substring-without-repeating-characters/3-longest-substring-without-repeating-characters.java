class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
    
        int left=0,right=0;
        int longest=0;
        HashSet<Character> window=new HashSet<>();
        while(right<n){
            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right));
                right++;
            }else{
                window.remove(s.charAt(left));
                left++;
            }
            longest=Math.max(longest,right-left);
        }
        return longest;
    }
}