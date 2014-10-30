import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Sherlock and The Beast
public class Mainclass14 {
	
	private static String fivs = null;
	private static String thrs = null;
    public static void solve(int[] myArray) 
    {
    	StringBuffer sb = new StringBuffer();
    	for (int i=0;i<myArray.length;i++) {
    		int numbers=myArray[i];
    		int threes=0; // minimum 5
			int fifths=0; // minimum 3
			
			if (numbers==1) {
				sb.append("-1\n");
				continue;
			}
			
			int quotient = numbers/3;
			int remainder = numbers%3;
			
			while( (quotient>0) && (remainder>0) && (remainder%5!=0) ){
				quotient--;
				remainder = numbers-quotient*3;
            }
			
            if(remainder%5==0) {
            	if (quotient>0) {
            		fivs = new String(new char[quotient*3]).replace("\0", "5");
            		sb.append(fivs);
            	}
		    	if (remainder>0) {
		    		thrs = new String(new char[remainder]).replace("\0", "3");
		    		sb.append(thrs);
		    	}
		    	if ( (quotient>0) || (remainder>0) )
				sb.append("\n");
            } else {
            	sb.append("-1\n");
            }
    	}
    	System.out.println(sb);
    }	

    public static void main(String[] args) 
    {
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