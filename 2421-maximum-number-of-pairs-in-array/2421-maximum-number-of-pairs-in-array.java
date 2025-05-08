class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] res=new int[2];
        int p=0,l=0;
        for(int i: map.keySet()){
            p+=map.get(i)/2;
            l+=map.get(i)%2;
        }
        res[0]=p;
        res[1]=l;
        return res;
    }
}