class Solution {
    public int maximumDifference(int[] nums) {
        int res=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    int diff=Math.abs(nums[i]-nums[j]);
                    res=Math.max(res,diff);
                }
            }
        }
        return res;
    }
}