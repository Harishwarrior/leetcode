class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result=new ArrayList<Boolean>();
        int largest = 0;
        for(int candie: candies){
            if(candie>largest){
                largest=candie;
            }
        }
        
        for(int candie:candies){
            if((candie+extraCandies)>=largest){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    } 
    
}