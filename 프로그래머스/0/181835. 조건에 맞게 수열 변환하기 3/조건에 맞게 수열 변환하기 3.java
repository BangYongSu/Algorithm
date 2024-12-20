class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[arr.length];
        int p = 0;
        for(int i : arr){
            
            if(k%2!=0){
            answer[p] = i*k;
            p++;
                }else{
                answer[p] = i+k;
            p++;
            }
        }
        
        
        
        
        
        return answer;
    }
}