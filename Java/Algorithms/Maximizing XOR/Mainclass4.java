import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Utopian Tree
public class Mainclass4 {

    public static void solve(int x , int y) {
    	int max=0;
    	for (int i=x;i<=y;i++) {
    		for (int z=y;z>=x;z--) {
    			if ( (i^z)>max ){
    				max=i^z;
    			}
    		}
    		
    	}
    	System.out.println(max);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int x =  in.nextInt();
        int y =  in.nextInt();
        solve(x,y);
    }
}
