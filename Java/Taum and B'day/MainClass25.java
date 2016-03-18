import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass25 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	long b = in.nextInt(); // b*x
            long w = in.nextInt(); // w*y
            
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            
            BigInteger totalAmount;
            if (x>y) {
            	totalAmount=BigInteger.valueOf(w*y);
            	if ( x>(y+z) ) {
            		totalAmount=totalAmount.add(BigInteger.valueOf(b*(y+z)));
            	} else {
            		totalAmount=totalAmount.add(BigInteger.valueOf(b*x));
            	}
            } else if (y>x) {
            	totalAmount=BigInteger.valueOf(b*x);
            	if ( y>(x+z) ) {
            		totalAmount=totalAmount.add(BigInteger.valueOf(w*(x+z)));
            	} else {
            		BigInteger tup=BigInteger.valueOf(w*y);
            		totalAmount=totalAmount.add(tup);
            	}
            } else {
            	totalAmount=BigInteger.valueOf((b*x)+(w*y));
            }
            
            System.out.print(String.valueOf(totalAmount)+"\n");
        }
    }
}
