Time Conversion
=============

Given a time in AM/PM format, convert it to military (2424-hour) time.

Note: Midnight is 12:00:00AM12:00:00AM on a 1212-hour clock, and 00:00:0000:00:00 on a 2424-hour clock. Noon is 12:00:00PM12:00:00PM on a 1212-hour clock, and 12:00:0012:00:00 on a 2424-hour clock.

Input Format

A single string containing a time in 1212-hour clock format (i.e.: hh:mm:ssAMhh:mm:ssAM or hh:mm:ssPMhh:mm:ssPM), where 01≤hh≤1201≤hh≤12.

Output Format

Convert and print the given time in 2424-hour format, where 00≤hh≤2300≤hh≤23.

Sample Input
```
07:05:45PM
```
Sample Output
```
19:05:45
```