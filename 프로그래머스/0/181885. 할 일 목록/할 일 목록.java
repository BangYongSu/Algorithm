class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int a=0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                a++;
            }
        }
        
        String[] answer = new String[a];
        int b=0;
       for(int i=0;i<finished.length;i++){
            if(!finished[i]){
       
                answer[b] = todo_list[i];
                b++;
       
            }
       }
        return answer;
    }
}