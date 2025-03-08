class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int l=0,r=0,w=0,min=Integer.MAX_VALUE;
        while(r<n){
            if(blocks.charAt(r)=='W'){
                w++;
            }
            if(r-l+1==k){
                min=Math.min(min,w);
                if(blocks.charAt(l)=='W'){
                    w--;
                }
                l++;
            }
            r++;
        }
        return min;
    }
}