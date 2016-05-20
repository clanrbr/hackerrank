import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a = 0; a < t; a++) {
        	String firstString = in.next();
        	int len = 1;
        	HashMap<String, Integer> hm = new HashMap<String, Integer>();

        	while (len < firstString.length()) {
        		for (int i = 0; i < firstString.length() - (len - 1); i++) {
        			String str = firstString.substring(i, i + len);
        			char[] arr = str.toCharArray();
        			Arrays.sort(arr);
        			str = String.valueOf(arr);
        			
        			if (hm.containsKey(str)) {
        				hm.put(str, hm.get(str) + 1);
        			} else {
        				hm.put(str, 1);
        			}
        		}

        		len++;
        	}

        	int pairCount = 0;
        	for (Integer i : hm.values()) {
        		if (i >= 2) {
        			pairCount += (i * i - i) / 2;
        		}
        	} 

        	System.out.println(pairCount);
        }
    }
}
