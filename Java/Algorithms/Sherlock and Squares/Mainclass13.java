import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Sherlock and Squares
public class Mainclass13 {
	
    public static void solve(long[][] myArray) 
    {
    	StringBuffer sb = new StringBuffer();
    	for (int i=0;i<myArray.length;i++) {
    		int numbers = (int)(Math.floor(Math.sqrt(myArray[i][1])) - Math.ceil(Math.sqrt(myArray[i][0])) + 1);
            sb.append(numbers + "\n");
    	}
    	System.out.println(sb);
    }	

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        long[][] testCases= new long[cases][];
        int i=0;
        while (i<cases) {
        	long[] numbers= new long[2];
        	numbers[0]=in.nextInt();
			numbers[1]=in.nextInt();
			testCases[i]=numbers;
			
        	i++;
        }
        solve(testCases);
    }
}
