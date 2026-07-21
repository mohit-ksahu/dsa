class Solution {
    public String removeOuterParentheses(String s){
        StringBuilder result = new StringBuilder();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(count > 0){
                    result.append(ch);
                }
                count = count + 1;
            }
            else{
                count = count - 1;
                
                if(count > 0){
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}