import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Cut the sticks
public class Mainclass8 {

    public static void solve(int[] myLengthArray) {
    	List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i<myLengthArray.length; i++) {
            intList.add(myLengthArray[i]);
        }
	    
        
        while (intList.size()!=0) {
        	int minimal=Collections.min(intList);
        	System.out.println(intList.size());
            for (int y=0; y < intList.size(); y++) {
            	if (intList.get(y)-minimal==0) {
            		intList.remove(intList.get(y));
            		y--;
            	} else {
            		intList.set(y, intList.get(y)-minimal);
            	}
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        int[] testCases= new int[cases];
        int i=0;
        while (i<cases) {
        	testCases[i]=in.nextInt();
        	i++;
        }
        solve(testCases);
    }
}
