class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            char a = myString.charAt(i);
            if(a < 'l'){
                a= 'l';
            abstring.append(a);
            }else{
                abstring.append(a);
            }
        }
        answer = abstring.toString();
        return answer;
    }
}