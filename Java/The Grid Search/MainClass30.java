import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass30 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int firstR = in.nextInt();
            int firstC = in.nextInt();
            String firstMatrix[] = new String[firstR];
            for(int G_i=0; G_i < firstR; G_i++) {
            	firstMatrix[G_i] = in.next();
            }
            
            int secondR = in.nextInt();
            int secondC = in.nextInt();
            String secondMatrix[] = new String[secondR];
            for(int P_i=0; P_i < secondR; P_i++) {
            	secondMatrix[P_i] = in.next();
            }
            
        	int currentMatchIndexI=0;
        	int lastIndexMatch=0;
        	
        	String matchIndexes="";
        	
        	int match=0;
        	outerloop:
            for (int i=0;i<firstR;i++) {
            	int lastIndexMatchCurrent=firstMatrix[i].indexOf(secondMatrix[currentMatchIndexI]);
            	if (lastIndexMatchCurrent>=0) {
            		matchIndexes=lastIndexMatchCurrent+",";
            	}
            	while (lastIndexMatchCurrent >= 0) {
            	    lastIndexMatchCurrent=firstMatrix[i].indexOf(secondMatrix[currentMatchIndexI],lastIndexMatchCurrent+1);
            	    if (lastIndexMatchCurrent>=0) {
            	    	matchIndexes+=lastIndexMatchCurrent+",";
            	    }
            	}

            	
            	if ( matchIndexes.length()>0 ) {
            		if ( i+1<firstR ) {
            			int currentMatchIndexY=1;
            			for (int y=i+1;y<firstR;y++) {
            				List<Integer> arr = new ArrayList<Integer>();
            				int currentMatchIndex=firstMatrix[y].indexOf(secondMatrix[currentMatchIndexY]);
            				if (currentMatchIndex>=0) {
            					arr.add(currentMatchIndex);
            				}
            				
            				while (currentMatchIndex>=0) {
            					currentMatchIndex=firstMatrix[y].indexOf(secondMatrix[currentMatchIndexY],currentMatchIndex+1);
                        	    if (lastIndexMatchCurrent>=0) {
                        	    	arr.add(currentMatchIndex);
                        	    }
            				}
            				
            				int p=0;
            				int temp_=0;
            				while(p<arr.size()) {
            					int curr=arr.get(p);
            					if ( matchIndexes.contains(curr+",") ) {
            						temp_=1;
            					} else {
            						arr.remove(p);
            						p--;
            					}
            					p++;
            				}
            				
            				match=temp_;
            				
            				if (match==0) {
            					break;
            				}
            				
            				if (currentMatchIndexY+1<secondR) {
            					currentMatchIndexY++;
            				} else {
            					break;
            				}
                		}
            			
            			if (match==1) {
            				System.out.print("YES\n");
            				break outerloop;
            			}
            		}
            	}
            }
            
            if (match==0) {
            	System.out.print("NO\n");
            }
        }
    }
}
