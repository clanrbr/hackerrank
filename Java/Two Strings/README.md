Two Strings
=============


You are given two strings,  and . Find if there is a substring that appears in both  and .

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer , the number of test cases.

Then there will be  descriptions of the test cases. Each description contains two lines. The first line contains the string  and the second line contains the string .

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.


Sample Input
```
2
hello
world
hi
world
```
Sample Output
```
YES
NO
```
Explanation

For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
For the 2nd test case, hi and world do not have a common substring, hence the answer NO.