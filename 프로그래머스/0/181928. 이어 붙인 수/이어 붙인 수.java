class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] hol = new int[num_list.length];
        int[] jjak = new int[num_list.length];
        String holr = "";
        String jjakr ="";
        for(int i=0;i<num_list.length; i++){
            if(num_list[i]%2==0){
                jjak[i]= num_list[i];
            }else if(num_list[i]%2!=0){
                hol[i]=num_list[i];
            }
              }
            for(int i=0; i<num_list.length;i++){
                if(hol[i]!=0){
                    holr += hol[i];
                }
                   if(jjak[i]!=0){
                    jjakr += jjak[i];
                }
                
            }
            answer = Integer.valueOf(holr)+Integer.valueOf(jjakr);
      
        return answer;
    }
}