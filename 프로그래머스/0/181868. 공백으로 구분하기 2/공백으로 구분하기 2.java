import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringBuilder abs =new StringBuilder();
     ArrayList<String> as = new ArrayList<>();
       ArrayList<String> ads = new ArrayList<>();
        String[] answer ;
        for(int i=0;i<my_string.length();i++){
            char a=my_string.charAt(i);
            if(a!=' '){
                abs.append(a);
            }else{
                as.add(abs.toString().replaceAll(" ",""));
                
                abs.setLength(0);
            }
            
        }
        as.add(abs.toString());
       for(int i=0;i<as.size();i++){
           if(!as.get(i).equals("")){
           ads.add(as.get(i));
       }
       }
        answer = new String[ads.size()];
        for(int i=0;i<ads.size();i++){
            
            answer[i] = ads.get(i);
                
        }
        return answer;
    }
}