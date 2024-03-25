import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
ArrayList<Integer> arr = new ArrayList<Integer>();
int testcase =Integer.parseInt(br.readLine()) ;
for(int i=0; i<testcase;i++) {
	int minval = Integer.MAX_VALUE;
	int maxval = Integer.MIN_VALUE;
	int testcaseAmount = Integer.parseInt(br.readLine()) ;
	String data[] = br.readLine().split(" ");
for(int j=0;j<data.length;j++) {
	int dataj =Integer.parseInt(data[j]);
	if(minval>dataj) {
		minval = dataj;
		
	}
	if(maxval<dataj) {
		maxval=dataj;
	}


}
System.out.println(minval+" "+maxval);
}



	}

}
