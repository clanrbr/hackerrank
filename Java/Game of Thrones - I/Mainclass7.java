import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Game of Thrones - I
public class Mainclass7 {

    public static void solve(String myAnagram) {
    	Hashtable<String, Integer> letters	= new Hashtable<String, Integer>();
		char[] singleWord = myAnagram.toCharArray(); 
		int sizeWord=singleWord.length;
		for (int y=0;y<sizeWord;y++) {
			Integer n = letters.get(String.valueOf(singleWord[y]));
			if (n != null) {
				letters.put(String.valueOf(singleWord[y]) ,n+1);
			} else {
				letters.put(String.valueOf(singleWord[y]) ,1);
			}
		}
    		
    	Set<Entry<String, Integer>> entrySet = letters.entrySet();
    	Iterator<Entry<String, Integer>> it = entrySet.iterator();
    	int result=0;
    	int singleResult=0;
    	while(it.hasNext()) {
    		int newVal=letters.get(it.next().getKey());
    		if (newVal==1) {
    			singleResult++;
    		} else {
    			if ( newVal%2!=0 ) {
        			result++;
        		}
    		}
    	}
    	
    	String status="NO";
    	if (sizeWord%2==0) {
    		if ( (singleResult == 0) && (result==0) ) {
    			status="YES";
    		}
    	} else {
    		if ( ( (singleResult==0) && (result==1) ) || ( (singleResult==1) && (result==0) ) ) {
    			status="YES";
    		}
    	}
    	
    	System.out.println(status);

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String myAnagram =  in.next();
        solve(myAnagram);
    }
}
