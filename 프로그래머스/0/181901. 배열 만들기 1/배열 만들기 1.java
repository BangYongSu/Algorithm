class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int index =0;
        int a=0;
        for (int i=k;i<=n;i=i+k){
            a++;
        }
        answer = new int[a];
        for (int i=k;i<=n;i=i+k){
        answer[index++] = i; 
        }
        return answer;
    }
}