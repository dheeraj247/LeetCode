class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<messages.length;i++){
            String msg=messages[i];
            String sender=senders[i];
            int count=msg.split(" ").length;
            map.put(sender,map.getOrDefault(sender,0)+count);
        }
        String res="";
        int maxc=0;
        for(String i: map.keySet()){
            int c=map.get(i);
            if(c>maxc || (c==maxc && i.compareTo(res)>0)){
                maxc=c;
                res=i;
            }
        }
        return res;
    }
}