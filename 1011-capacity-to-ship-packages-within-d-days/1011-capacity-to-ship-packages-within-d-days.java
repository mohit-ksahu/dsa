class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int i = 0; i < weights.length; i++){
            if(weights[i] > low){
                low = weights[i];
            }

            high = high + weights[i];
        }

        int answer = high;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int requiredDays = findDays(weights, mid);

            if(requiredDays <= days){
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return answer;
    }

    int findDays(int[] weights, int capacity){
        int days = 1;
        int currentWeight = 0;

        for(int i = 0; i < weights.length; i++){

            if(currentWeight + weights[i] <= capacity){
                currentWeight = currentWeight + weights[i];
            }
            else{
                days = days + 1;
                currentWeight = weights[i];
            }
        }
        return days;
    }
}