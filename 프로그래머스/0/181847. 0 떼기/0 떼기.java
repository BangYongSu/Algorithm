class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder abstring = new StringBuilder();
        
        for(int i=0;i<n_str.length();i++){
        char a = n_str.charAt(i);
            if(a!='0'){
                for(int j=i;j<n_str.length();j++){
                    char b =n_str.charAt(j);
                    abstring.append(b);
                }
                answer = abstring.toString();
                break;
            }
                
        }
        
        return answer;
    }
}