import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MainClass39 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=0;i<2*t;i++) {
			String stringFirst=in.next();
			String stringSecond = in.next();
			Map<Character,Integer> hm = new HashMap<Character,Integer>();
			
			char[] ch=stringFirst.toCharArray();
			int p=0;
			for (int y=0;y<ch.length;y++) {
				if (!(hm.containsKey(ch[y])) ) {
					if (stringSecond.indexOf(String.valueOf(ch[y]))>-1) {
						p=1;
						break;
					}
					hm.put(ch[y], 1);
				}
			}
			if (p==0) {
				System.out.print("NO\n");
			} else {
				System.out.print("YES\n");
			}
		}
	}
}
