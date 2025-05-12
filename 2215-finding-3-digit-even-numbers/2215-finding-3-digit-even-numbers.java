class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    String num=""+digits[i]+digits[j]+digits[k];
                    if(num.charAt(0)=='0'){
                        continue;
                    }
                    if(Integer.parseInt(num)%2==0){
                        set.add(Integer.parseInt(num));
                    }
                }
            }
        }
        int[] res=new int[set.size()];
        int index=0;
        for(int i: set){
            res[index++]=i;
        }
        Arrays.sort(res);
        return res;
    }
}