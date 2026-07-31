class Solution {
    public int[] twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                int[] result = new int[2];
                result[0] = left + 1;
                result[1] = right + 1;

                return result;
            }
            else if(sum < target){
                left = left + 1;
            }
            else{
                right = right - 1;
            }
        }

        return new int[0];
    }
}