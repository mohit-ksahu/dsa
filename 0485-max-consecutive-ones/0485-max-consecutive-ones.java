class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;

        for (int val : nums){
            if (val == 1){
                current++;
                if (current > max){
                    max = current;
                }
            }else {
                current = 0;
            }
        }

        return max;
    }
}