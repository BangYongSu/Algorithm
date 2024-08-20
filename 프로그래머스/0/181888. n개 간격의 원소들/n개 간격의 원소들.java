class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int bb=0;
       int arr[] = new int[num_list.length];
        for(int i=0;i<num_list.length;i=i+n){
            arr[i]=num_list[i];
        }
        
        for(int num : arr){
            if(num !=0 ){
                bb++;
            }
        }
            answer= new int[bb];
            int index=0;
            for(int i=0; i<arr.length;i++){
                if(arr[i]!=0){
                    answer[index++] =arr[i];
                }
            }
        
        return answer;
    }
}