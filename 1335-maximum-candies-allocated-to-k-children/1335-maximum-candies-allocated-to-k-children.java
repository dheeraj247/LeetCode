class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=Integer.MIN_VALUE;
        for(int i: candies){
            max=Math.max(i,max);
        }
        int l=1,r=max,res=0;
        while(l<=r){
            int mid=(l+r)/2;
            long c=0;
            for(int i: candies){
                c+=i/mid;
            }
            if(c>=k){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}