
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tries = in.nextInt();
		for (int z=0;z<tries; z++) {
			String s = in.next();
			String r = new StringBuilder(s).reverse().toString();
		
	        int count=0;
	        
	        for(int i=1;i<s.length();i++)
	          {
	             if (Math.abs(s.charAt(i) - s.charAt(i-1))==Math.abs(r.charAt(i) - r.charAt(i-1)))
	               {count++;
	   
	               }
	          }
	        
	        if ( count==s.length()-1) {
	        	System.out.print("Funny\n");
	        } else {
	        	System.out.print("Not Funny\n");
	        } 
	    } 
	}
}
