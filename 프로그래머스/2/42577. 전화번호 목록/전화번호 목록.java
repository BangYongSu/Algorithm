import java.util.HashMap;


class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer>hash=new HashMap<>();
			
			for(String str:phone_book) {
				hash.put(str, str.length());
			}

			for(String str:phone_book) {
				for(int j=1;j<str.length();j++) {
					if(hash.containsKey(str.substring(0,j))) return false;
				}
			}	


      
        return answer;
    }
}