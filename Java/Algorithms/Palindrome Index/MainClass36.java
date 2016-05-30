
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass36 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tries = in.nextInt();
		for (int z=0;z<tries; z++) {
			String s = in.next();
			int index=-1;
			int i=0;
			int j=s.length()-1;
			while(i<j) {
				if ( !(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(j)))) ) {
					String newS = "";
					if (i==0) {
						newS = s.substring(1,s.length());
					} else {
						newS = s.substring(0,i)+s.substring(i+1,s.length());
					}
					if (isPalindrome(newS)) {
						index=i;
					} else {
						index=j;
					}
					break;
				}
				
				i++;
				j--;
			}
	        
	        
		    System.out.print(index+"\n");
		}
	}
	
	
	private static boolean isPalindrome(String str){
        for (int p=0;p<str.length()-1;p++) {
        	if ( !(String.valueOf(str.charAt(p)).equals(String.valueOf(str.charAt(str.length()-1-p)))) ) {
        		return false;
        	}
        }
        return true;
    }
}
