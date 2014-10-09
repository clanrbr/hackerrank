import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Utopian Tree
public class Mainclass {

    public static void solve(int[] myArray) {
      for(int i=0;i<myArray.length;i++) {
        int start=1;
        if (myArray[i]==0) {
          System.out.println(start);
        } else {
          for (int y=1;y<=myArray[i];y++) {
            if (y%2==0) {
            	start++;
            } else {
            	start=start*2;
            }
          }
          System.out.println(start);
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int[] b = null;
        int possible_cases=  in.nextInt();
        if (possible_cases>0) {
          b = new int[possible_cases];
        }

        int i=0;
        while (i<possible_cases) {
            b[i]=in.nextInt();
            i++;
        }

        solve(b);
    }
}
