class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        while(true){
            Set<Integer> set=new HashSet<>();
            boolean hd=false;
            for(int i: list){
                if(set.contains(i)){
                    hd=true;
                    break;
                }
                set.add(i);
            }
            if(!hd){
                break;
            }
            int rc=Math.min(3,list.size());
            for(int i=0;i<rc;i++){
                list.remove(0);
            }
            c++;
        }
        return c;
    }
}