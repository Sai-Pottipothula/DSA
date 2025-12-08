class Solution {
    StringBuilder sb = new StringBuilder();
    int open=0;
    public String removeOuterParentheses(String s) {
        for(char ch : s.toCharArray()){
            if(ch == '(' ){
                if(open > 0){
                    sb.append(ch);
                }
                open++;
            }
            else{
                open--;
              if(open>0){
                sb.append(ch);
              }
            }         
        }
        return sb.toString();
    }
}