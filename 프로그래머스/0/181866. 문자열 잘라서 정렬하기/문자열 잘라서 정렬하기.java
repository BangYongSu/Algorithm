import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
      String[] aString =myString.split("x");
        Arrays.sort(aString);
      ArrayList<String> aList = new ArrayList<>();
        for(String a : aString){
            if(!a.equals("")){
            aList.add(a);
            }
        }
        String [] answer = new String[aList.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = aList.get(i);
        }
        return answer;
    }
}