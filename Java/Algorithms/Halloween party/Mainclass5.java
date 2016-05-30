import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Halloween party
public class Mainclass5 {

    public static void solve(int[] numberlines) {
    	long  numberOfHorizontals=0;
    	long numberOfVerticals=0;
    	for (int i=0;i<numberlines.length;i++) {
    		if (numberlines[i]%2==0){
    			numberOfHorizontals=numberlines[i]/2;
				numberOfVerticals=numberlines[i]/2;
    		} else {
    			numberOfHorizontals=((numberlines[i]-1)/2) +1;
    			numberOfVerticals=(numberlines[i]-1)/2;
    		}
    		System.out.println(numberOfHorizontals*numberOfVerticals);
    	}
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases =  in.nextInt();
        int[] numberlines = new int[testCases];
        
        int i=0;
        while (i<numberlines.length) {
        	numberlines[i]=in.nextInt();
        	i++;
        }
        solve(numberlines);
    }
}
