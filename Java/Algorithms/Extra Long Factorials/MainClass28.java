import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger fact=new BigInteger("1");
	    int n = in.nextInt();
	    if ( n < 0 ) {
	    	
	    } else {
	        for ( long i = 1 ; i <= n ; i++ ) {
	        	fact = fact.multiply(BigInteger.valueOf(i));
	        }

	        System.out.println(fact);
	     }
	}
}
