import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String k = in.nextLine();
		k=k.replaceAll("\\s+","");
		char[] arr = k.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i=0;i<alphabet.length;i++) {
			hm.put(alphabet[i], 0);
		}
		
		for (int i=0;i<arr.length;i++){
			hm.put(Character.toLowerCase(arr[i]),1);
		}
		
		int pangrams=1;
		for (Integer value : hm.values()) {
			if (value==0) {
				pangrams=0;
			}
		}
		
		if (pangrams==0) {
			System.out.print("not pangram");
		} else {
			System.out.print("pangram\n");
		}
	}
}
