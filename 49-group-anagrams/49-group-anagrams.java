class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        if(strs.length==0) return result;
        HashMap<String, List<String>> map = new HashMap();
        for(String s:strs){
            char[] hash=new char[26];
            for(char c:s.toCharArray()){
                hash[c-'a']++;
            }
            String str=new String(hash);
            if(map.get(str)==null){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}