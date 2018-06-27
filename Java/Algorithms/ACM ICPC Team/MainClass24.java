import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass24 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        
        String lastHigher="";
        int numberOfOnes=0;
        int numberTeams=0;
        for (int i=0;i<n-1;i++) {
        	for (int y=i+1;y<n;y++) {
        		int tempNumberOfOnes = 0;
        		for (int p=0; p<m; p++){
        	        if ( (topic[i].charAt(p)=='1') || (topic[y].charAt(p) == '1') ){
        	        	tempNumberOfOnes+= 1;
        	        }
        	    }
                if (tempNumberOfOnes > numberOfOnes){
                	numberOfOnes = tempNumberOfOnes;
                	numberTeams = 1;
                } else if (tempNumberOfOnes == numberOfOnes){
                	numberTeams += 1;
                }
        	}
        }
        
        System.out.print(String.valueOf(numberOfOnes)+"\n");
        System.out.print(String.valueOf(numberTeams));
        
    }
}


