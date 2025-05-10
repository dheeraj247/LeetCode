class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1=0,s2=0,z1=0,z2=0;
        for(int i: nums1){
            if(i==0){
                z1++;
            }
            s1+=i;
        }
        for(int i: nums2){
            if(i==0){
                z2++;
            }
            s2+=i;
        }
        s1+=z1;
        s2+=z2;
        if((z1==0 && s2>s1) || (z2==0 && s1>s2)){
            return -1;
        }
        return Math.max(s1,s2);
    }
}