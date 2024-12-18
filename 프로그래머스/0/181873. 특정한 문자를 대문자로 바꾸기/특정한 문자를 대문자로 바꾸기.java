class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        for(int i=0; i<my_string.length();i++){
            char a = my_string.charAt(i);
            String b = String.valueOf(a);
            if(b.equals(alp)){
                abstring.append(b.toUpperCase());
            }else{
                abstring.append(a);
            }
            
        }
        answer = abstring.toString();
        return answer;
    }
}