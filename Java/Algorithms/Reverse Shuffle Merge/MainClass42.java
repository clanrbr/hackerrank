import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass42 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader systemInput = new BufferedReader(new InputStreamReader(System.in));
        String string = systemInput.readLine();
        int stringLength = string.length();
        int alphabetLength = 256;
        int[] needToMatch = new int[alphabetLength];
        int needToMatchSize = 0;

        for (int stringIndex = 0; stringIndex < stringLength; ++stringIndex) {
            char currentCharacter = string.charAt(stringIndex);
            if (needToMatch[currentCharacter] == 0) {
                ++needToMatchSize;
            }
            ++needToMatch[currentCharacter];
        }

        for (int i = 0; i < alphabetLength; ++i) {
            needToMatch[i] /= 2;
        }
        StringBuilder result = new StringBuilder(stringLength / 2);

        int[] window = new int[alphabetLength];
        int[] needToMatchClone = needToMatch.clone();
        int unmatchedSize = needToMatchSize;
        int windowIndex;
        for (windowIndex = 0; windowIndex < stringLength; ++windowIndex) {
            char currentCharacter = string.charAt(windowIndex);
//            int previousFrequency = needToMatchClone[currentCharacter];
            --needToMatchClone[currentCharacter];
            ++window[currentCharacter];
            if (needToMatchClone[currentCharacter] == 0) {
                --unmatchedSize;
            }
            if (unmatchedSize == 0) {
                break;
            }
        }
        
        TreeMap<Character, Integer> notInWindow = new TreeMap<Character, Integer>();
        for (int stringIndex = windowIndex + 1; stringIndex < stringLength; ++stringIndex) {
            char currentCharacter = string.charAt(stringIndex);
            if (needToMatch[currentCharacter] > 0) {
                if (!notInWindow.containsKey(currentCharacter)) {
                    notInWindow.put(currentCharacter, 0);
                }
                notInWindow.put(currentCharacter, notInWindow.get(currentCharacter) + 1);
            }
        }
        int endIndex = stringLength - 1;
        Character minCharacterPossible = (char)0;
        while (needToMatchSize > 0) {
            Character windowCharacter = string.charAt(windowIndex);
            Character notInWindowCharacter = notInWindow.ceilingKey(minCharacterPossible);
            boolean isWindowCharacter = (notInWindowCharacter == null || windowCharacter.compareTo(notInWindowCharacter) < 0);
            char minCharacter = isWindowCharacter ? windowCharacter : notInWindowCharacter;
            if (needToMatch[minCharacter] == 0) {
                if (isWindowCharacter) {
                    --windowIndex;
                } else {
                    notInWindow.put(minCharacter, notInWindow.get(minCharacter) - 1);
                    if (notInWindow.get(minCharacter) == 0) {
                        notInWindow.remove(minCharacter);
                    }
                }
                continue;
            }
            
            if (isWindowCharacter) {
                notInWindow.clear();
                endIndex = windowIndex;
            } else {
                for (; endIndex > windowIndex; --endIndex) {
                    char currentCharacter = string.charAt(endIndex);
                    if (notInWindow.containsKey(currentCharacter)) {
                        notInWindow.put(currentCharacter, notInWindow.get(currentCharacter) - 1);
                        if (notInWindow.get(currentCharacter) == 0) {
                            notInWindow.remove(currentCharacter);
                        }
                    }
                    if (currentCharacter == minCharacter) {
                        --endIndex;
                        break;
                    }
                }
            }

            result.append(minCharacter);
            --needToMatch[minCharacter];
            if (needToMatch[minCharacter] == 0) {
                --needToMatchSize;
            }

            boolean isSelectedCharacter = isWindowCharacter;
            for (; windowIndex >= 0 && window[string.charAt(windowIndex)] > needToMatch[string.charAt(windowIndex)]; --windowIndex) {
                char currentCharacter = string.charAt(windowIndex);
                --window[currentCharacter];
                if (needToMatch[currentCharacter] > 0 && !isSelectedCharacter) {
                    if (!notInWindow.containsKey(currentCharacter)) {
                        notInWindow.put(currentCharacter, 0);
                    }
                    notInWindow.put(currentCharacter, notInWindow.get(currentCharacter) + 1);
                }
                isSelectedCharacter = false;
            }
        }
        System.out.println(result.toString());
    }
}