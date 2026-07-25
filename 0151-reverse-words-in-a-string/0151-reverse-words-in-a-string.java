class Solution {
    public String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0){
                break;
            }

            int j = i;

            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            if(result.length() > 0){
                result.append(' ');
            }

            String word = s.substring(i + 1, j + 1);
            result.append(word);
        }
        return result.toString();
    }
}