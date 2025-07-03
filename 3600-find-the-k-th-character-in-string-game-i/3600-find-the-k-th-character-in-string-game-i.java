class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder();
        s.append('a');
        while(s.length()<=k){
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char currentChar = s.charAt(i);
                char nextChar = (char) (currentChar == 'z' ? 'a' : currentChar + 1);
                s1.append(nextChar);
            }
            s.append(s1);
        }
        return s.charAt(k-1);
    }
}