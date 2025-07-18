class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(List<String> i: responses){
            HashSet<String> set=new HashSet<>(i);
            for(String j: set){
                map.put(j,map.getOrDefault(j,0)+1);
            }
        }
        String res=null;
        int max=0;
        for(String s: map.keySet()){
            int freq=map.get(s);
            if(freq>max){
                max=freq;
                res=s;
            }
            else if(freq == max && s.compareTo(res) < 0){
                res=s;
            }
        }
        return res;
    }
}