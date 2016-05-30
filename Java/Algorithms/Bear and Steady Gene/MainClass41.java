import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass41 {
	
	private static int trimTail (int tailIndex, int headIndex, HashMap<Character, Integer> tokens, char[] arr) {
	    while (true) {
	        char tailCh = arr[tailIndex];
	        if (tokens.get((Character)tailCh) == null) {
	            tailIndex++;
	            continue;
	        } else if ((tokens.get((Character)tailCh) < 0)) {
	            int incrementMe = tokens.get((Character)tailCh) + 1;
	            tokens.put((Character)tailCh, incrementMe);
	            tailIndex++;
	            continue;
	        } else if ((tokens.get((Character)tailCh) >= 0)) {
	            return tailIndex;
	        }
	    }
	}

	private static boolean subStringSatisfied (HashMap<Character, Integer> charMap) {
	    for (int count : charMap.values()) {
	        if (count > 0)
	            return false;
	    }
	    return true;
	}

	private static int findFirstHead(char[] arr, HashMap<Character, Integer> charMap, int tailIndex) {

	    int headIndex = tailIndex;

	    while (headIndex < arr.length) {
	        char tokenIn = arr[headIndex];
	        if (charMap.get(tokenIn) != null) {
	            int newCount = charMap.get(tokenIn) - 1;
	            charMap.put(tokenIn, newCount);
	            if (newCount == 0) {
	                if (subStringSatisfied(charMap)) {
	                    return headIndex;
	                }
	            }
	        }
	        headIndex++;
	    }
	    return headIndex;
	}

	public static void main(String[] args) throws FileNotFoundException {
	    Scanner in = new Scanner(System.in);

	    int arrSize = in.nextInt();
	    String sequence = in.next();

	    int amountA = 0;
	    int amountC = 0;
	    int amountT = 0;
	    int amountG = 0;

	    char[] arr = new char[arrSize];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = sequence.charAt(i);
	        switch (arr[i]) {
	            case 'A': amountA++;
	                      break;
	            case 'C': amountC++;
	                      break;
	            case 'T': amountT++;
	                      break;
	            case 'G': amountG++;
	                      break;
	        }
	    }

	    int oneFourth = arrSize/4;
	    if (amountA == oneFourth && amountC == oneFourth && amountT == oneFourth) {
	        System.out.println(0);
	        return;
	    }

	    HashMap<Character, Integer> tokens = new HashMap<Character, Integer>();

	    if (amountA - oneFourth > 0)
	        tokens.put('A', amountA-oneFourth);
	    if (amountC - oneFourth > 0)
	        tokens.put('C', amountC-oneFourth);
	    if (amountT - oneFourth > 0)
	        tokens.put('T', amountT-oneFourth);
	    if (amountG - oneFourth > 0)
	        tokens.put('G', amountG-oneFourth);
	    
	    int minSize = 0;
	    for (int i : tokens.values())
	        minSize += i;

	    int tailIndex = 0;
	    while (!tokens.keySet().contains((Character)arr[tailIndex])) {
	        tailIndex++;
	    }
	    int headIndex = findFirstHead(arr, tokens, tailIndex);
	    tailIndex = trimTail(tailIndex, headIndex, tokens, arr);

	    int bestSizeFound = headIndex + 1 - tailIndex;

	    int reqTokens = 0;

	    while (headIndex + 1 + reqTokens < arr.length) {
	        headIndex++;
	        tailIndex++;
	        if (tokens.get((Character)arr[tailIndex - 1]) != null) {    
	            tokens.put((Character)arr[tailIndex - 1], tokens.get((Character)arr[tailIndex - 1]) + 1);
	        }
	        if (tokens.get((Character)arr[headIndex]) != null) {
	            int deIncrementMe = tokens.get((Character)arr[headIndex]) - 1;
	            tokens.put((Character)arr[headIndex], deIncrementMe);
	            if (subStringSatisfied(tokens))
	                tailIndex = trimTail(tailIndex, headIndex, tokens, arr);
	        }
	    }
	    System.out.println(headIndex+1-tailIndex);
	}
}
