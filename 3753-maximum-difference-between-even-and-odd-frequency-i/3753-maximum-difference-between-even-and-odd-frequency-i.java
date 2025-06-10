class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int oddMax=Integer.MIN_VALUE;
        int evenMin=Integer.MAX_VALUE;
        for(char i: map.keySet()){
            if(map.get(i)%2==1){
                oddMax=Math.max(oddMax,map.get(i));
            }
            else{
                evenMin=Math.min(evenMin,map.get(i));
            }
        }
        return oddMax-evenMin;
    }
}