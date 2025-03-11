class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int[] hash={-1,-1,-1};
        char[] s1=s.toCharArray();
        for(int i=0;i<s.length();i++){
            hash[s1[i]-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                c+=1+Math.min(Math.min(hash[0],hash[1]),hash[2]);
            }
        }
        return c;
    }
}