class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] arr1 = new int[2];
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<queries[i].length;j++){
                arr1[j]=queries[i][j];
            }
             for(int p=arr1[0];p<=arr1[1];p++){
            arr[p]= arr[p]+1;
        }
        }
       
        int [] answer = arr;
        return answer;
    }
}