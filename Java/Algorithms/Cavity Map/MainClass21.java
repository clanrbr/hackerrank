import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass21 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        
        if (n>=3) {
        	String vv[][] = new String[n][n];
            for (int i=0; i<grid.length;i++) {
            	char[] singleElement=grid[i].toCharArray();
            	for (int y=0;y<singleElement.length;y++) {
            		vv[i][y]=String.valueOf(singleElement[y]);
            	}
            }
            
        	for (int i=1; i<n-1;i++) {
            	for (int y=1;y<n-1;y++) {
            		boolean correct= true;
            		if ( Integer.valueOf(vv[i][y])<=Integer.valueOf(vv[i][y-1]) ) {
            			correct=false;
            		}
            		
        			if ( Integer.valueOf(vv[i][y])<=Integer.valueOf(vv[i][y+1]) ) {
        				correct=false;
            		}

    				if ( Integer.valueOf(vv[i][y])<=Integer.valueOf(vv[i-1][y]) ) {
    					correct=false;
    				}
    				
    				if ( Integer.valueOf(vv[i][y])<=Integer.valueOf(vv[i+1][y]) ) {
    					correct=false;
    				}
    				
    				if (correct==true) {
    					StringBuilder sb = new StringBuilder(grid[i]);
    					sb.setCharAt(y, 'X');
    					grid[i] = sb.toString();
    				}
            	}
            }
        }
        
        for (int i=0;i<n;i++) {
        	System.out.print(grid[i]+"\n");
        }
    }
}
