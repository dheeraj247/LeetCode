class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int c=1,res=0,l=colors[0];
        for(int i=1;i<n+k-1;i++){
            int idx=i%n;
            if(colors[idx]==l){
                c=1;
                l=colors[idx];
                continue;
            }
            c++;
            if(c>=k){
                res++;
            }
            l=colors[idx];
        }
        return res;
    }
}