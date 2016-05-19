import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass38 {
	public static int bribeFunction( int q[], int n ) {
        int i = 0, numBribes = 0;
        for( i = n-2; i >= 0; i-- ) {
            int j = i+1, t = q[i];
            int countB = 0;
            while( (j < n) && (t > q[j]) ) {
                q[j-1] = q[j]; j++; countB++;
                if( countB > 2 ) {
                	return -1;
                }
            }
            q[j-1] = t; numBribes += countB;
        }
        return numBribes;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for( int i = 0; i < t; i++ ) {
            int n = in.nextInt();
            int q[] = new int[n];
            for( int j = 0; j < n; j++ ) {
            	q[j] = in.nextInt();
            }
            int result= bribeFunction(q, n);
            if (result<0) {
            	System.out.println("Too chaotic");
            } else {
            	System.out.println( result );
            }
        }
    }
}
