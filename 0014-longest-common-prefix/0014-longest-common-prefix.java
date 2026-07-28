class Solution {
    public String longestCommonPrefix(String[] st) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(st);
        String first = st[0];
        String last =st[st.length-1];
        for(int i=0;i< Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return res.toString();
            }
            res.append(first.charAt(i));
        }
        return res.toString();
    }
}