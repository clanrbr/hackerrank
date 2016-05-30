
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass35 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tries = in.nextInt();
		for (int z=0;z<tries; z++) {
			String s = in.next();
			
			if ( s.length()%2!=0 ) {
				
				System.out.print("-1\n");
			} else {
				int mid=s.length()/2;
				Map<String,Integer> hmFirst = new HashMap<String,Integer>();
				Map<String,Integer> hmSecond = new HashMap<String,Integer>();
				for (int i=0;i<mid;i++) {
					if ( hmFirst.containsKey(String.valueOf(s.charAt(i))) ) {
						hmFirst.put(String.valueOf(s.charAt(i)), hmFirst.get(String.valueOf(s.charAt(i)))+1);
					} else {
						hmFirst.put(String.valueOf(s.charAt(i)), 1);
					}
					
					if ( hmSecond.containsKey(String.valueOf(s.charAt(mid+i))) ) {
						hmSecond.put(String.valueOf(s.charAt(mid+i)), hmSecond.get(String.valueOf(s.charAt(mid+i)))+1);
					} else {
						hmSecond.put(String.valueOf(s.charAt(mid+i)), 1);
					}
					
				
				}
				
				
				int match=0;
				Iterator it = hmFirst.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        if ( hmSecond.containsKey(pair.getKey()) ) {
			        	int currentValue = Integer.parseInt(pair.getValue().toString());
			        	int secondValue= hmSecond.get(pair.getKey());
			        	if (currentValue>secondValue) {
			        		match+=currentValue-secondValue;
			        	}
			        } else {
			        	match+=Integer.parseInt(pair.getValue().toString());
			        }
			        it.remove(); // avoids a ConcurrentModificationException
			    }
			    
			    System.out.print(match+"\n");
			}
	    }
	}
}
