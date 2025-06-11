class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i)==1 && !map.containsKey(i+1) && !map.containsKey(i-1)){
                res.add(i);
            }
        }
        return res;
    }
}