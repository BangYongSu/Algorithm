class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        int hop = 1;
        int gop = 0;
        for(int i=0; i<num_list.length;i++){
            hop *= num_list[i];
            gop += num_list[i];
        }
        gop = gop*gop;
        if(hop>gop){
            answer=0;
        }else if(hop<gop){
            answer +=1;
        }
        return answer;
    }
}