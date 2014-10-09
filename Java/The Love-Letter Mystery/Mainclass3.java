import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// The Love-Letter Mystery
public class Mainclass3 {
	private static String[] lines = null;
	
	 public static void solve(String[] myArray) {
		for (int i=0;i<myArray.length;i++) {
			int firstIndex= 0;
			int lastIndex= myArray[i].length() -1;
			int totalActions=0;
			char[] charArray = myArray[i].toCharArray();
			
			while (firstIndex!=lastIndex) {
				int difference=charArray[lastIndex]-charArray[firstIndex];
				if (difference < 0) {
					difference=difference*-1;
				}
				totalActions+=difference;
				if ( (lastIndex-firstIndex)==1) {
					break;
				}
				firstIndex++;
				lastIndex--;
			}
			System.out.println(totalActions);
		}
     }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int testCases=in.nextInt();
	        
	        lines = new String[testCases];
	        int i=0;
	        while (i<testCases) {
	        	lines[i]=in.next();
	        	i++;
	        }
	        
	        solve(lines);
	    }
}
