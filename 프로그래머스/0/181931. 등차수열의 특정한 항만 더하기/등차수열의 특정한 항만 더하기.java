class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] c = new int[included.length];
        int sum=a;
        for(int i=0;i<c.length;i++){
            c[i]= sum;
            if(included[i]){
                answer += sum;
            }
            sum +=d;
        }
        return answer;
    }
}