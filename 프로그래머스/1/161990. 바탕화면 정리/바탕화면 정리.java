import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String[] wallpaper) {
	    	ArrayList<Integer> wherex = new ArrayList<Integer>();
	    	ArrayList<Integer> wherey = new ArrayList<Integer>();
	    	String sharp  ;
	    	
	    	
	    	for(int i =0; i<wallpaper.length;i++) {
		    	for(int j =0; j<wallpaper[i].length();j++) {
		    		//System.out.println(j+"번째"+wallpaper[i].charAt(j));
		    		//System.out.println(i+"번째"+j+"번째");
		    		sharp = wallpaper[i].charAt(j)+"";
		    		if(sharp.equals("#")) {
		    			wherex.add(i);
		    			wherey.add(j); 
		    		}
		    	
		    	}
		    	}
	    	//for문으로 찾기
//	    	int maxValuex = Integer.MIN_VALUE;
//	    	int minValuex = Integer.MAX_VALUE;
//	    	int maxValuey = Integer.MIN_VALUE;
//	    	int minValuey= Integer.MAX_VALUE;
//	    	for(int x : wherex) {
//	    	
//	    		if(x >maxValuex) {
//	    			maxValuex= x;
//	    		}
//	    		if(x<minValuex) {
//	    			minValuex= x;
//	    		}
//	    	
//	    	}
//	    	for(int y : wherey) {
//		    	
//	    		if(y >maxValuey) {
//	    			maxValuey= y;
//	    		}
//	    		if(y<minValuey) {
//	    			minValuey= y;
//	    		}
//	    	
//	    	}
//	    	System.out.println(minValuex+"minx");
//	    	System.out.println(maxValuex+"maxx");
//	    	System.out.println(minValuey+"miny");
//	    	System.out.println(maxValuey+"maxy");

	    	wherex.sort((o1, o2) ->o1-o2 );

	    	wherey.sort((o1, o2) -> o1-o2);

	        int[] answer = {wherex.get(0),wherey.get(0),wherex.get(wherex.size()-1)+1,wherey.get(wherey.size()-1)+1};
	       
	        
	        
	        return answer;
    }
}