import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass27 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String hour="";
        String minutes="";
        String[] numbers={"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        
        if (m==0) {
        	minutes=numbers[h-1]+" o' clock";
        } else if (m==15) {
        	minutes="quarter past "+numbers[h-1];
        } else if (m==30) {
        	minutes="half past "+numbers[h-1];
        } else if (m==45) {
        	if (h==12) {
        		h=1;
        	}
        	minutes="quarter to "+numbers[h];
        } else {
        	if (m<20) {
        		String text="minutes";
        		if (m==1) {
        			text="minute";
        		}
        		
        		minutes=numbers[m-1]+" "+text+" past "+ numbers[h-1];
        	} else if ( (m>=20) && m<30 ) {
        		char[] nums=String.valueOf(m).toCharArray();
        		minutes="twenty ";
        		if (nums[1]=='0') {
        			minutes+="minutes past "+numbers[h-1];
        		} else {
        			minutes+=numbers[Integer.parseInt(String.valueOf(nums[1]))-1]+ " minutes past "+numbers[h-1];
        		}
        	} else if ( (m>30) && (m<=40) ) {
        		int newNumber=60-m;
        		if (h==12) {
        			h=1;
        		}
        		char[] nums=String.valueOf(newNumber).toCharArray();
        		minutes="twenty ";
        		if (nums[1]=='0') {
        			minutes+="minutes to "+numbers[h];
        		} else {
        			minutes+=numbers[Integer.parseInt(String.valueOf(nums[1]))-1]+ " minutes to "+numbers[h];
        		}
        	} else {
        		int newNumber=60-m;
        		if (h==12) {
        			h=1;
        		}
        		
        		String text="minutes";
        		if (m==1) {
        			text="minute";
        		}
        		
        		minutes+=numbers[newNumber-1]+ " "+text+ " to "+numbers[h];
        	}
        }
        
        System.out.print(minutes);
        
        
//        5:00 five o' clock -
//        5:01 one minute past five
//        5:10 ten minutes past five
//        5:30 half past five -
//        5:40 twenty minutes to six
//        5:45 quarter to six -
//        5:47 thirteen minutes to six
//        5:28 twenty eight minutes past five
    }
}
