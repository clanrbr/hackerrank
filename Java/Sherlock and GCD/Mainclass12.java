import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Sherlock and GCD
public class Mainclass12 {
	
	private static long gcd(long a, long b)
	{
	    while (b > 0) {
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	
    public static void solve(long[][] myArray) 
    {
    	for (int i=0;i<myArray.length;i++) {
    		long gc = 0;
    		for (int y=1;y<myArray[i].length;y++) {
    			gc = gcd(gc,myArray[i][y]);
    		}
    		if(gc==1)
                System.out.println("YES");
            else
                System.out.println("NO");
    	}
    }	

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        long[][] testCases= new long[cases][];
        int i=0;
        while (i<cases) {
        	int numb=in.nextInt();
        	long[] numbers= new long[numb];
        	int y=0;
        	while(y<numb) {
        		numbers[y]=in.nextLong();
        		y++;
        	}
        	testCases[i]=numbers;
        	i++;
        }
        solve(testCases);
    }
}
