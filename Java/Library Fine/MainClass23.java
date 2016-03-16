import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass23 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        String firstLine=String.valueOf(d1)+"-"+String.valueOf(m1)+"-"+String.valueOf(y1);
        String lastLine=String.valueOf(d2)+"-"+String.valueOf(m2)+"-"+String.valueOf(y2);
        
        SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
        long fine=0;
        
		try {
			Date firstDate = originalFormat.parse(firstLine.toString());
			Date lastDate = originalFormat.parse(lastLine.toString());
			if (  firstDate.after(lastDate) ) {
				long difference = Math.abs(lastDate.getTime() - firstDate.getTime());
	            long differenceDates = difference / (24 * 60 * 60 * 1000);
	        	if ( y1>y2 ) {
	        		fine=10000;
	        	} else if ( m1>m2 ) {
	        		fine=500*Math.abs(m2-m1);
	        	} else if (d1>d2) {
	        		fine=differenceDates*15;
	        	}
	        	
	        }
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        System.out.print(String.valueOf(fine));
    }
}
