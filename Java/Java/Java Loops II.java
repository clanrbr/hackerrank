import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int previousSum = 0;
            String line = "";
            for (int numb=0; numb<n; numb++) {
                int currentSum = (int)Math.pow(2, numb)*b;
                previousSum += currentSum;
                line += String.valueOf(a + previousSum) + " ";
            }
            System.out.format("%s\n",line);
        }
        in.close();
    }
}