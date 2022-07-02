class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack= new Stack<Integer>();
        int[] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int n = stack.pop();
                res[n]=i-n;
            }
            stack.push(i);
        }
        return res;
    }
}