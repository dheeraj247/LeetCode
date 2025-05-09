class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        list.sort((a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return Integer.compare(b,a);
            }
            return Integer.compare(map.get(a),map.get(b));
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}