import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass33 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tries = in.nextInt();
		for (int i=0;i<tries; i++) {
			int deletedItems=0;
			String s = in.next().toLowerCase();
			char [] chArray = s.toCharArray();
			char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			
			final StringBuffer sb = new StringBuffer();
			for(int p=0;p<alphabet.length;p++) {
				String pattern=String.valueOf(alphabet[p])+String.valueOf(alphabet[p])+"+";
			    s=s.replaceAll(pattern,String.valueOf(alphabet[p]));
			    
			}
			int counter=chArray.length-s.length();
			System.out.print(counter+"\n");
		}
	}
}
