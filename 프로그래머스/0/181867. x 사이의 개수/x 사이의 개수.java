import java.util.*;
class Solution {
    public int[] solution(String myString) {
        
        ArrayList<Integer> aList = new ArrayList<>();
        StringBuilder abstring = new StringBuilder();
        int c =0;
        
        for(int i=0;i<myString.length();i++){
        char a= myString.charAt(i);
            if(a!='x'){
                c++;
            }else if(a =='x'){
                aList.add(c);
                c=0;
            }
        }
        aList.add(c);
    int[] answer = new int[aList.size()];
        for(int i=0;i<answer.length;i++){
        answer[i] = aList.get(i);
        }
        return answer;
    }
}