class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<=n-3;i++){
            if((nums[i]+nums[i+2])*2==nums[i+1]){
                c++;
            }
        }
        return c;
    }
}