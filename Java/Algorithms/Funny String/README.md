Funny String
=============


Suppose you have some string SS having length NN that is indexed from 00 to N−1N−1. You also have some string RR that is the reverse of string SS. SS is funny if the condition | S[j]−S[j−1] |=| R[j]−R[j−1] || S[j]−S[j−1] |=| R[j]−R[j−1] | is true for every jj from 11 to N−1N−1.

Note: For some string SS, S[j]S[j] denotes the ASCII value of the jthjth zero-indexed character in SS. The absolute value of some integer xx is written as | x || x |.

Input Format

The first line contains an integer, TT (the number of test cases). 
The TT subsequent lines each contain a string, where the ithith line is string SiSi.

Constraints 
1≤T≤101≤T≤10 
0≤i≤T−10≤i≤T−1 
2≤length of Si≤100002≤length of Si≤10000

Output Format

For each SiSi, print Funny or Not Funny on a new line.

Sample Input
```
2
acxz
bcxz
```
Sample Output
```
Funny
Not Funny
```
Explanation

Test Case 0: S0=S0= "acxz" 
|c−a|=2=|x−z||c−a|=2=|x−z| 
|x−c|=21=|c−x||x−c|=21=|c−x| 
|z−x|=2=|a−c||z−x|=2=|a−c| 
We print Funny.

Test Case 1: S1=S1= "bcxz" 
|c−b|=1|c−b|=1, but |x−z|=2|x−z|=2 
We stop evaluating the string (as |c−b|≠|x−z||c−b|≠|x−z|), and print Not Funny.