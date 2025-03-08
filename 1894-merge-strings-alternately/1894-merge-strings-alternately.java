class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        while(i<n1 && j<n2){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n1){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<n2){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}