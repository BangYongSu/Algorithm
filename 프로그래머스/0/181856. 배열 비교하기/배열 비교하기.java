class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length<arr2.length){
            answer = -1;
        }else if(arr1.length==arr2.length){
            int arr1t=0;
            int arr2t=0;
            for(int i=0;i<arr1.length;i++){
                arr1t+=arr1[i];
                arr2t+=arr2[i];
            }
            if(arr1t<arr2t){
                answer=-1;
            }else if(arr1t>arr2t){
                answer=1;
            }else{
            answer = 0;    
            }
            
        }else{
             answer = 1;
        }
        return answer;
    }
}