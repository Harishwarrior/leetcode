class Solution {
    public boolean isPalindrome(String s) {
     
        if(s.isEmpty()){
            return false;
        }
        int head=0;
        int tail= s.length()-1;
        
        while(head<tail){
            char headChar=s.charAt(head);
            char tailChar=s.charAt(tail);
            if(!Character.isLetterOrDigit(headChar)){
                head++;
            }else if(!Character.isLetterOrDigit(tailChar)){
                tail--;
            }else{
                if(Character.toLowerCase(headChar)!=Character.toLowerCase(tailChar)){
                    return false;
                }
                head++;
                tail--;
            }
        }return true;
    }
}