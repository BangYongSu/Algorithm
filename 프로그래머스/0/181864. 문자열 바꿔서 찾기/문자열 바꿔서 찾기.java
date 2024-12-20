class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder abstring = new StringBuilder();
        for(int i=0; i<myString.length();i++){
            char a = myString.charAt(i);
            if(a=='B'){
                a='A';
                abstring.append(a);
            }else{
                a='B';
                abstring.append(a);
            }
            
            
            
        }
       myString =abstring.toString();
        if(myString.contains(pat)){
                answer=1;
            }
        return answer;
    }
}