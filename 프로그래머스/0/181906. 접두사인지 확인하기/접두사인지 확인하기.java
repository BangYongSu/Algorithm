class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String [] ans = new String[my_string.length()];
        int index= 0;
        String b= "";
        for (int i = 0; i < my_string.length(); i++) {
        ans[i] = my_string.substring(i, i + 1);
    }
        for(int i=0; i<ans.length;i++){
            b += ans[i];
            if(b.equals(is_prefix)){
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}