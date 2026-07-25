class Solution {
    public int romanToInt(String s){
        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int value = getValue(s.charAt(i));

            if(i + 1 < s.length()){
                int nextValue = getValue(s.charAt(i + 1));

                if(value < nextValue){
                    total = total - value;
                }
                else{
                    total = total + value;
                }
            }
            else{
                total = total + value;
            }
        }
        return total;
    }

    int getValue(char ch){
        if(ch == 'I'){
            return 1;
        }
        else if(ch == 'V'){
            return 5;
        }
        else if(ch == 'X'){
            return 10;
        }
        else if(ch == 'L'){
            return 50;
        }
        else if(ch == 'C'){
            return 100;
        }
        else if(ch == 'D'){
            return 500;
        }
        else{
            return 1000;
        }
    }
}