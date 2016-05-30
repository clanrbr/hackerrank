import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass43 {

    public static int solveDynamic(char str1[],char str2[]){
        int resultMatrix[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < resultMatrix.length; i++) {
            for(int j=1; j < resultMatrix[i].length; j++) {
                if (str1[i-1] == str2[j-1]) {
                	resultMatrix[i][j] = resultMatrix[i - 1][j - 1] + 1;
                } else {
                	resultMatrix[i][j] = Math.max(resultMatrix[i][j-1],resultMatrix[i-1][j]);
                }
                
                if (resultMatrix[i][j] > max) {
                    max = resultMatrix[i][j];
                }
            }
        }
        return max;
    
    }
	
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		String firstString = in.nextLine();
		String secondString = in.nextLine();
		
        int result = solveDynamic(firstString.toCharArray(), secondString.toCharArray());
        System.out.print(result);
		
	}
}
