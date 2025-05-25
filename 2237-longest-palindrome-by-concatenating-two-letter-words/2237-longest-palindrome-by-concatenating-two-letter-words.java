class Solution {
    public int longestPalindrome(String[] words) {
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(String i: words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int len=0;
        boolean hasMid=false;
        for(String i: map.keySet()){
            String rev=new StringBuilder(i).reverse().toString();
            if(i.equals(rev)){
                int count=map.get(i);
                len+=(count/2)*4;
                if(count%2==1){
                    hasMid=true;
                }
            }
            else if(map.containsKey(rev)){
                int p=Math.min(map.get(i),map.get(rev));
                len+=p*4;
                map.put(i,0);
                map.put(rev,0);
            }
        }
        if(hasMid){
            len+=2;
        }
        return len;
    }
}