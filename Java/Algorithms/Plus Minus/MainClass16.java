import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass16 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int positive=0;
		int negative=0;
		int zeroes=0;
        for (int i=0;i<arr.length;i++) {
        	if (arr[i]>0) {
        		positive++;
        	} else if (arr[i]<0) {
        		negative++;
        	} else {
        		zeroes++;
        	}
        }
        
        
        double subscPositive=((float) positive)/n;
        double subscNegative=((float) negative)/n;
        double subscZeroes=((float) zeroes)/n;
        
        
       
        
        String out = String.format("%.6f",subscPositive);
        String out1 = String.format("%.6f",subscNegative);
        String out2 = String.format("%.6f",subscZeroes);
        System.out.println(out);
        System.out.println(out1);
        System.out.println(out2);

    }
}
