class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String v1 = ""+a+b;
        String v2 = ""+b+a;
      
        return Integer.valueOf(v1)>Integer.valueOf(v2)? Integer.valueOf(v1):Integer.valueOf(v2);
    }
}