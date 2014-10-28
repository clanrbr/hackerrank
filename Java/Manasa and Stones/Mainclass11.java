import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

// Manasa and Stones
public class Mainclass11 {  

	
    public static void solve(int[][] myArray) {
    	for(int i=0;i<myArray.length;i++) {
    		Set setA = new HashSet();
    		int minNumber=myArray[i][1];
    		int maxNumber=myArray[i][2];
    		if (myArray[i][1]>myArray[i][2]) {
    			minNumber=myArray[i][2];
    			maxNumber=myArray[i][1];
    		}
    		
    		int y=0;
			while(y<myArray[i][0]) {
				setA.add( (myArray[i][0]-y-1)*minNumber+ (y*maxNumber) );
				y++;
			}
			
			List list = new ArrayList(setA);
			Collections.sort(list);
			
			String listString = "";
			Iterator t = list.iterator();
			while (t.hasNext()) {
			    listString+=String.valueOf(t.next()) + " ";
		    }
			
			System.out.println(listString);
    	}
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        int[][] testCases= new int[cases][];
        int i=0;
        while (i<cases) {
        	int[] singleCase = new int[3];
        	singleCase[0]=in.nextInt();
			singleCase[1]=in.nextInt();
			singleCase[2]=in.nextInt();
        	testCases[i]=singleCase;
        	i++;
        }
        solve(testCases);
    }
}