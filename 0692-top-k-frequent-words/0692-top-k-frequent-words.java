class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i: words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        list.sort((a,b) -> {
            int freq=map.get(b)-map.get(a);
            if(freq==0){
                return a.compareTo(b);
            }
            return freq;
        });
        List<String> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(list.get(i));
        }
        return res;
    }
}