class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            char b= myString.charAt(i);
            if(b == 'a'){
                abstring.append(String.valueOf(b).toUpperCase());
            }else if(b == 'A'){
                abstring.append(b);
                
            }else{
                abstring.append(String.valueOf(b).toLowerCase());
            }
        }
        answer = abstring.toString();
        
        return answer;
    }
}