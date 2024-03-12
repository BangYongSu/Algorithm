
class Solution {
    static int Re;
     public static int solution(int[] numbers, int target) {
          int answer = 0;
          Re = 0;
          dfs(0,numbers,target,0);
          answer = Re;
        return answer;
    }
	  public static void dfs (int index, int [] numbers, int target, int sum) {
		  if(index==numbers.length) {
			  if(target==sum) {
				  Re ++;
			  }
			  
			  return;
		  }
		  dfs(index+1,numbers,target,sum+numbers[index]);
		  dfs(index+1,numbers,target,sum-numbers[index]);
	  }
    
}