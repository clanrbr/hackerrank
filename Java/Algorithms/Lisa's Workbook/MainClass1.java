import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] arrayNumb = new int[n];
        for (int i=0;i<n; i++) {
        	arrayNumb[i]=in.nextInt();
        }
        
        int currentPage=1;
        int special=0;
        for (int i=0;i<n;i++) {
        	for (int y=1;y<=arrayNumb[i];y++) {
        		if ( y==currentPage ) {
        			special++;
        		}
        		
        		if ( (y%k==0) && (y<arrayNumb[i]) ) {
        			currentPage++;
        		}
        		
        	}
        	currentPage++;
        }
        System.out.print(special);
        
	}
}
