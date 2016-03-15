import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i=1;i<=n;i++) {
        	String repeatedEmpty = new String(new char[n-i]).replace("\0", " ");
        	String repeatedSymbol = new String(new char[i]).replace("\0", "#");
        	System.out.print(repeatedEmpty+repeatedSymbol+"\n");
        }
	}

}
