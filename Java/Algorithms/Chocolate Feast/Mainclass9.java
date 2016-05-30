import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Chocolate Feast
public class Mainclass9 {
	private static int rest=0;
	
	public static int[] connect(int rest,int sell,Double bonusChocolate) {
		String doubleAsText = bonusChocolate.toString();
    	double number = Double.parseDouble(doubleAsText);
    	int decimal = Integer.parseInt(doubleAsText.split("\\.")[0]);
    	int fractional = rest-(sell*decimal);
    	int[] b = {decimal,fractional};
    	
    	return b;
	}

    public static void solve(int[][] myThreeArray) {
    	for(int i=0;i<myThreeArray.length;i++) {
    		int numberChocolate=0;
    		Double manipulation=0.0;
    		manipulation=((double) myThreeArray[i][0]/(double) myThreeArray[i][1]);
    		if ( manipulation>0) {
    			numberChocolate= manipulation.intValue();
    		}
    		
    		
    		Double bonusChocolate=0.0;
    		if (numberChocolate>0) {
    			if ((double)numberChocolate/(double)myThreeArray[i][2] >=1 ) {
    				rest=numberChocolate;
    				bonusChocolate = ( (double)numberChocolate/(double)myThreeArray[i][2]);
    				
    				int[] bonuses=connect(rest,myThreeArray[i][2],bonusChocolate);
    				rest=bonuses[0]+bonuses[1];
    				numberChocolate+=bonuses[0];
    				
    				while ( (double) rest/ (double) myThreeArray[i][2]>=1.0) {
    					double  secondBonus= ((double)rest/ (double)myThreeArray[i][2]);
    					int [] secondbonuses = connect(rest,myThreeArray[i][2],secondBonus);
    					rest=secondbonuses[0] + secondbonuses[1];
    					numberChocolate+=secondbonuses[0];
    				}
    			}
    		}
    		System.out.println(numberChocolate);
    	}
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases =  in.nextInt();
        int[][] testCases= new int[cases][];
        int i=0;
        while (i<cases) {
        	int [] singleLine= new int[3];
        	singleLine[0]=in.nextInt();
        	singleLine[1]=in.nextInt();
			singleLine[2]=in.nextInt();
			testCases[i]=singleLine;
        	i++;
        }
        solve(testCases);
    }
}
