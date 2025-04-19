class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int s1=0,ts=0,max=nums[0],min=nums[0];
        for(int i: nums){
            s1+=i;
            max=Math.max(s1,max);
            if(s1<0){
                s1=0;
            }
            ts+=i;
        }
        int s2=0;
        for(int i: nums){
            s2+=i;
            min=Math.min(s2,min);
            if(s2>0){
                s2=0;
            }
        }
        int ns=max;
        int cs=ts-min;
        if(ts==min){
            return ns;
        }
        return Math.max(cs,ns);
    }
}