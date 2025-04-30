class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i: nums){
            int c=count(i);
            if(c%2==0){
                res++;
            }
        }
        return res;
    }
    int count(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c;
    }
}