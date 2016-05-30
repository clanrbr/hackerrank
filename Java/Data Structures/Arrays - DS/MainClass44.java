import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MainClass44 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        StringBuilder lb = new StringBuilder();
        for (int i=n-1;i>=0;i--) {
            lb.append(arr[i]+" ");
        }
        
        System.out.print(lb);
    }
}
