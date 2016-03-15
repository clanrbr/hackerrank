import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass20 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char[] charArray = s.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        String result="";
        while (k>26) {
        	k=k-26;
        }
        
        for (int i=0; i<charArray.length;i++) {
        	if ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z')) {
        		int ascii = (int) charArray[i];
        		if ( !Character.isUpperCase(charArray[i]) ) {
        			if ( (ascii+k) > 122 ) {
            			int left=97+ascii+k-122-1;
            			result+=Character.toString((char) (left) );
            		} else {
            			result+=Character.toString((char) (ascii+k) );
            		}
        		} else {
        			if ( (ascii+k) > 90 ) {
            			int left=65+ascii+k-90-1;
            			result+=Character.toString((char) (left) );
            		} else {
            			result+=Character.toString((char) (ascii+k) );
            		}
        		}
        		
        	} else {
        		result+=charArray[i];
        	}
        	
        }
        System.out.print(result);
    }
}
