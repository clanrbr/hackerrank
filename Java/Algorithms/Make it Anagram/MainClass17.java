import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MainClass17 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String firstString=in.nextLine();
		String secondString=in.nextLine();
		char[] firstStringArray = firstString.toCharArray();
		char[] secondStringArray = secondString.toCharArray();
		
		Map<Character, Integer> hm1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hm2 = new HashMap<Character, Integer>();
		for (int i=0;i<firstStringArray.length;i++) {
			if (hm1.containsKey(firstStringArray[i])) {
				hm1.put(firstStringArray[i], hm1.get(firstStringArray[i])+1 );
			} else {
				hm1.put(firstStringArray[i], 1 );
			}
		}
		
		int number=0;
		
		for (int i=0;i<secondStringArray.length;i++) {
			if (hm2.containsKey(secondStringArray[i])) {
				hm2.put(secondStringArray[i], hm2.get(secondStringArray[i])+1 );
			} else {
				hm2.put(secondStringArray[i], 1 );
			}
			if ( !hm1.containsKey(secondStringArray[i]) ) {
				number++;
			}
		}
		
		
		 Iterator it = hm1.entrySet().iterator();
		 while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if ( hm2.containsKey(pair.getKey()) ) {
		        	int aa = hm2.get(pair.getKey());
		        	number=number + Math.abs(hm1.get(pair.getKey())- hm2.get(pair.getKey()) );
		        } else {
		        	number=number+hm1.get(pair.getKey());
		        }
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		 System.out.println(number);
    }
}
