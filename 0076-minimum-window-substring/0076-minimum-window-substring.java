class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l=0,r=0,min=Integer.MAX_VALUE,count=map.size(),start=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    count--;
                }
            }
            r++;
            while(count==0){
                if(r-l<min){
                    min=r-l;
                    start=l;
                }
                char temp=s.charAt(l);
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                    if(map.get(temp)>0){
                        count++;
                    }
                }
                l++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+min);
    }
}