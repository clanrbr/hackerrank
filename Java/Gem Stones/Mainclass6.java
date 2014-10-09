import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Gem Stones
public class Mainclass6 {
	
	static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}

    public static void solve(String[] numberlines, int testCases) {
    	Hashtable<String, Integer> letters	= new Hashtable<String, Integer>();
    	for (int i=0;i<numberlines.length;i++) {
    		char[] singleWord = numberlines[i].toCharArray(); 
    		for (int y=0;y<singleWord.length;y++) {
    			Integer n = letters.get(String.valueOf(singleWord[y]));
    			if (n != null) {
    				letters.put(String.valueOf(singleWord[y]) ,n+1);
    			} else {
    				letters.put(String.valueOf(singleWord[y]) ,1);
    			}
    		}
    	}
    	Set<Entry<String, Integer>> entrySet = letters.entrySet();
    	Iterator<Entry<String, Integer>> it = entrySet.iterator();
    	int result=0;
    	while(it.hasNext()) {
    		if ( letters.get(it.next().getKey())>=testCases ) {
    			result++;
    		}
    	}
    	
    	System.out.println(result);


    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases =  in.nextInt();
        String[] numberlines = new String[testCases];
        
        int i=0;
        while (i<numberlines.length) {
        	numberlines[i]=removeDuplicates(in.next());
        	i++;
        }
        solve(numberlines,testCases);
    }
}
