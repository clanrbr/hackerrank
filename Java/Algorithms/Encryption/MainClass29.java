import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String newString = s;
        double sqrt = Math.sqrt(newString.length());
        int rows=(int) sqrt;
		List<ArrayList<Character>> cList = new ArrayList<ArrayList<Character>>();
        for (int i=0;i<=rows;i++) {
        	char [] charArray;
        	int step=rows;
        	if (sqrt%1!=0) {
        		step=rows+1;
        	}
        	if ( (i*step)<newString.length() ) {
        		if ( (i*step)+step>newString.length() ) {
            		charArray = newString.substring(i*step,newString.length()).toCharArray();
            	} else {
            		charArray = newString.substring(i*step,i*step+step).toCharArray();
            	}
        		
        		ArrayList<Character> temp = new ArrayList<Character>();
            	for (char ch : charArray) {
            		temp.add(ch);
        		}
            	cList.add(temp);
        	} 
        }
        
        String result="";
        
        for (int i=0;i<rows+1;i++) {
        	for (int y=0;y<rows+1;y++) {
        		if (y<cList.size()) { 
	        		ArrayList<Character> singleRow = cList.get(y);
	        		if (i<singleRow.size()) {
	        			result+=singleRow.get(i);
	        		}
        		}
        	}
        	result+=" ";
        }
        System.out.print(result);
	}
}
