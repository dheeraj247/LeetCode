class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0,max=Integer.MIN_VALUE,maxdiff=Integer.MIN_VALUE;
        for(int i: nums){
            res=Math.max(res,(long)maxdiff*i);
            maxdiff=Math.max(maxdiff,max-i);
            max=Math.max(max,i);
        }
        return res;
    }
}