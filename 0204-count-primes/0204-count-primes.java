import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] isPrime = new boolean[n / 2];
        Arrays.fill(isPrime, true);

        int count = 1;

        for(int num = 3; num * num < n; num += 2){
            int idx = num / 2;
            if(isPrime[idx]){
                for(int multiple = num * num; multiple < n; multiple += 2 * num){
                    isPrime[multiple / 2] = false;
                }
            }
        }

        for(int i = 1; i < isPrime.length; i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
    }
}