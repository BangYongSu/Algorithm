import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        ArrayList<Character> aList = new ArrayList<>();
        Arrays.sort(indices);
        for(int i=0;i<my_string.length();i++){
            char abs = my_string.charAt(i);
            aList.add(abs);
        }
        for(int i=indices.length-1;i>=0;i--){
            aList.remove(indices[i]);
        }
        for(int i=0;i<aList.size();i++){
            String abc = String.valueOf(aList.get(i));
            abstring.append(abc);
        }
        answer= abstring.toString();
        return answer;
    }
}