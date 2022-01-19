class Solution {
    public int mostWordsFound(String[] sentences) {
        int noOfSpaces;
        int result=0;
        for (String sentence: sentences){
            noOfSpaces=0;
            for(char c:sentence.toCharArray()){
                if(c == ' '){
                    noOfSpaces++;
                }
            }
            if(result<noOfSpaces){
                result=noOfSpaces;
            }
            
        }
        return result+1;
    }
}