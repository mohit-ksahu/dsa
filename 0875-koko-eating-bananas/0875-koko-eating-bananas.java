class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int i = 0; i < piles.length; i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }

        int answer = high;

        while(low <= high){
            int mid = low + (high - low) / 2;

            long hours = findHours(piles, mid);

            if(hours <= h){
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }

    long findHours(int[] piles, int speed){
        long totalHours = 0;

        for(int i = 0; i < piles.length; i++){
            int value = piles[i];
            long hours = value / speed;

            if(value % speed != 0){
                hours = hours + 1;
            }

            totalHours = totalHours + hours;
        }
        return totalHours;
    }
}