class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start = 1;
        int end = 0;

        for(int i = 0; i < nums.size(); i++){
            if(nums[i] > end){
                end = nums[i];
            }
        }

        while(start < end){
            int mid = start + (end - start) / 2;
            bool possible = isPossible(nums, mid, threshold);

            if(possible){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return end;
    }

    bool isPossible(vector<int>& nums, int divisor, int threshold){
        int sum = 0;

        for(int i = 0; i < nums.size(); i++){
            int value = nums[i];
            int division = value / divisor;

            if(value % divisor != 0){
                division = division + 1;
            }

            sum = sum + division;

            if(sum > threshold){
                return false;
            }
        }
        return true;
    }
};