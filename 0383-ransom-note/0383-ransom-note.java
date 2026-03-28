class Solution {
    public boolean canConstruct(String ra, String ma) {
        if(ra.length()>ma.length()) return false;
        int[] counter = new int[26];
        for(char c:ma.toCharArray())
        counter[c-'a']++;
        for(char c: ra.toCharArray()){
            if(counter[c-'a']==0) return false;
            counter[c-'a']--;
        }
        return true;
    }
}