import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Service Lane
public class Mainclass2 {
	private int bike =1;
	private int car=2;
	private int truck=3;
	
	 public static void solve(int[] widths,int s0, int s1) {
	 	int i=s0;
	 	int minimal=3;
	 	while(i<=s1) {
	 		if (minimal>widths[i]) {
	 			minimal=widths[i];
	 		}
	 		i++;
	 	}
	 	System.out.println(minimal);
     }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] firstline = new int[2];	        
	        String possible_cases = in.nextLine();
	        if ( (possible_cases != null) && (!possible_cases.isEmpty()) ) {
	        	String[] newNumb=possible_cases.split(" ",-1);
	        	if ( (newNumb[0] != null) && (!newNumb[0].isEmpty()) ) {
	        		newNumb[0].trim();
        			firstline[0]=Integer.parseInt(newNumb[0].trim());
        		}
				if ( (newNumb[1] != null) && (!newNumb[1].isEmpty()) ) {
					newNumb[1].trim();
					firstline[1]=Integer.parseInt(newNumb[1]);
        		}
	        }
	        
	        if ( firstline[0]!= 0 ) {
	        	int[] roadWidths= new int[firstline[0]];
	        	String stringPossibleCases = in.nextLine();
	        	if ( (possible_cases != null) && (!possible_cases.isEmpty()) ) {
	        		String[] roadWidthsString=stringPossibleCases.split(" ",-1);
	        		
	        		for(int i=0;i<roadWidthsString.length;i++) {
	        			roadWidthsString[i].trim();
	        			roadWidths[i]=Integer.parseInt(roadWidthsString[i]);
	        		}
	        	}
	        	
	        	ArrayList<String[]> testCases = new ArrayList<String[]>();
	        	
	        	if (firstline[1]>0) {
	        		int y=0;
		        	while (y<firstline[1]) {
		        		String single_test_line_string=in.nextLine();
		        		final String[] single_test_line=single_test_line_string.split(" ",-1);
			        		single_test_line[0].trim();
			        		single_test_line[1].trim();
			        		testCases.add(single_test_line);
		        		y++;
		        	}
	        	}
	        	
	        	for (String[] s : testCases) {
	        		solve(roadWidths,Integer.parseInt(s[0]),Integer.parseInt(s[1]));
	        	}
	        }
	    }
}
