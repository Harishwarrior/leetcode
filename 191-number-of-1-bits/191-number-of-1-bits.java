public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String value=Integer.toBinaryString(n);
        int count=0;
        for(char c:value.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}