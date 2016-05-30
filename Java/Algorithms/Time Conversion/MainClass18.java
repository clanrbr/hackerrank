import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainClass18 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
       
        String timeOfDate = time.substring(time.length() - 2);
        time = time.substring(0, time.length() - 2);
        String[] group = time.split(":");
        
        String result="";
        if (timeOfDate.equals("PM") && (!group[0].equals("12")) ) {
        	int newNumber=Integer.parseInt(group[0])+12;
        	String newNum=String.valueOf(newNumber);
        	if (newNum.length()==1) {
        		newNum="0"+newNum;
        	}
        	result=newNum+":"+group[1]+":"+group[2];
        } else {
        	if (group[0].equals("12") && (Integer.parseInt(group[1])<45) ) {
        		group[0]="00";
        	}
        	result=group[0]+":"+group[1]+":"+group[2];
        }
        
        System.out.print(result);
    }
}