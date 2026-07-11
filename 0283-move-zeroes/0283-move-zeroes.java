class Solution {
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;

        for (int val : nums){
            if (val != 0){
                nums[insertPosition] = val;
                insertPosition++;
            }
        }

        while (insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}