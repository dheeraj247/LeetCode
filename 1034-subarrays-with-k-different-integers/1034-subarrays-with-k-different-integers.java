class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    int atMost(int[] nums,int k){
        int n=nums.length;
        int c=0,l=0,r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])==1){
                k--;
            }
            while(k<0){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    k++;
                }
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}