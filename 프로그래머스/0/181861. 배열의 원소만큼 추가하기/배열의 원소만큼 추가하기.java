class Solution {
    public int[] solution(int[] arr) {
        int c =0;
        for(int i: arr){
            c+= i;
        }
        int[] answer = new int[c];
        int b=0;
        int s=0;
        for(int i=0;i<answer.length;i++){
            int d=arr[b];
            if(d>s){
                answer[i]= d;
                s++;
                if(d==s){
                    b++;
                    s=0;
                }
            }
            
            
        }
        
          
        
                    
        
        
        return answer;
    }
}