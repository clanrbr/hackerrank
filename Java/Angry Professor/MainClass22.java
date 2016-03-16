import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass22 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            
            int number=0;
            for (int i=0;i<n;i++) {
            	if ( a[i]<=0 ) {
            		number++;
            	}
            }
            if (number>=k) {
            	System.out.print("NO\n");
            } else {
            	System.out.print("YES\n");
            }
        }
    }
}
