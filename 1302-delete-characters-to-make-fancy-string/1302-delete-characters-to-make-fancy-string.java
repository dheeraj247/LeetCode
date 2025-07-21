class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        char prev=s.charAt(0);
        int n=s.length(),freq=1;
        res.append(prev);
        for(int i=1;i<n;i++){
            if(s.charAt(i)==prev){
                freq++;
            }
            else{
                freq=1;
            }
            if(freq<3){
                res.append(s.charAt(i));
                prev=s.charAt(i);
            }
        }
        return res.toString();
    }
}