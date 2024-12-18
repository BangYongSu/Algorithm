class Solution {
    public String solution(String rny_string) {
        String answer = "";
    StringBuilder abstring = new StringBuilder();
        for(int i=0;i<rny_string.length();i++){
            char ab = rny_string.charAt(i);
            if(ab == 'm'){
                abstring.append("rn");
            }else{
            abstring.append(ab);
                }
        }
        answer = abstring.toString();
        return answer;
    }
}