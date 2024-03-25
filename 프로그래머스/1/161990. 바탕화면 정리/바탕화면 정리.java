import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String[] wallpaper) {
        	ArrayList<Integer> wherex = new ArrayList<Integer>();
	    	ArrayList<Integer> wherey = new ArrayList<Integer>();
	    	String sharp  ;
	    	
	    	
	    	for(int i =0; i<wallpaper.length;i++) {
		    	for(int j =0; j<wallpaper[i].length();j++) {
		    	
		    		sharp = wallpaper[i].charAt(j)+"";
		    		if(sharp.equals("#")) {
		    			wherex.add(i);
		    			wherey.add(j); 
		    		}
		    	
		    	}
		    	}
	    	int maxValuex = Integer.MIN_VALUE;
	    	int minValuex = Integer.MAX_VALUE;
	    	int maxValuey = Integer.MIN_VALUE;
	    	int minValuey= Integer.MAX_VALUE;
	    	for(int x : wherex) {
	    	
	    		if(x >maxValuex) {
	    			maxValuex= x;
	    		}
	    		if(x<minValuex) {
	    			minValuex= x;
	    		}
	    	
	    	}
	    	for(int y : wherey) {
		    	
	    		if(y >maxValuey) {
	    			maxValuey= y;
	    		}
	    		if(y<minValuey) {
	    			minValuey= y;
	    		}
	    	
	    	}
	    
	    	
	        int[] answer = {minValuex,minValuey,maxValuex+1,maxValuey+1};
	       
	        
	        
	        return answer;
    }
}