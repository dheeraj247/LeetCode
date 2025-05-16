class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n=nums.length;
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            List<Integer> arr=new ArrayList<>();
            int c=0;
            for(int j=i;j<n;j++){
                arr.add(nums[j]);
                if(nums[j]%p==0){
                    c++;
                }
                if(c>k){
                    break;
                }
                set.add(new ArrayList<>(arr));
            }
        }
        return set.size();
    }
}