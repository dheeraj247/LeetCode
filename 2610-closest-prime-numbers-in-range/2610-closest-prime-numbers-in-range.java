class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        if(primes.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int[] res=new int[2];
        for(int i=0;i<primes.size()-1;i++){
            int diff=Math.abs(primes.get(i)-primes.get(i+1));
            if(diff<min){
                min=diff;
                res[0]=primes.get(i);
                res[1]=primes.get(i+1);
            }
        }
        return res;
    }
    boolean isPrime(int n){
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}