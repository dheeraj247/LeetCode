class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s=Integer.toString(i);
            if(s.length()%2!=0){
                continue;
            }
            else{
                int mid=s.length()/2;
                int s1=0,s2=0;
                for(int j=0;j<mid;j++){
                    s1+=s.charAt(j)-'0';
                }
                for(int j=mid;j<s.length();j++){
                    s2+=s.charAt(j)-'0';
                }
                if(s1==s2){
                    c++;
                }
            }
        }
        return c;
    }
}