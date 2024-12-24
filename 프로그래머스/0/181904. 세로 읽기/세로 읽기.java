import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        int p=0;
        String[][] aList = new String[my_string.length()/m][m];
      for(int i=0;i<aList.length;i++){
          
          for(int j=0;j<aList[i].length;j++){
              char a= my_string.charAt(p);
              aList[i][j]=String.valueOf(a);
              if(j==c-1){
                  abstring.append(aList[i][j]);
              }
              p++;

          }
      }
        answer = abstring.toString();
        
        return answer;
    }
}