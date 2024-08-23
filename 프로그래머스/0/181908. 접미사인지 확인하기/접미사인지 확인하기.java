class Solution {
    public int solution(String my_string, String is_suffix) {
        String col ="";
        int answer = 0;
        for(int i =0; i<my_string.length();i++){
            col = my_string.substring(i,my_string.length());
            if(col.equals(is_suffix)){
                answer =1;
            }
        }
        
        return answer;
    }
}