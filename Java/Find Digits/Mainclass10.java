import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Find Digits
public class Mainclass10 {
	
    public static void solve(int[] myArray) {
		for(int i=0;i<myArray.length;i++) {
			int matches=0;
			int totalNumber=myArray[i];
			
			
			String number = String.valueOf(myArray[i]);
			char[] digits1 = number.toCharArray();
			
			for (int y=0; y<digits1.length;y++) {
				int mynumber= digits1[y] - '0';
				if (mynumber>0) {
					if ( (totalNumber%mynumber)==0) {
						matches++;
					}
				}
			}
			
			System.out.println(matches);
		}
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        int[] testCases= new int[cases];
        int i=0;
        while (i<cases) {
        	testCases[i]=in.nextInt();
        	i++;
        }
        solve(testCases);
    }
}
