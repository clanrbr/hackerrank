Maximizing XOR
=============

Given two integers, LL and RR, find the maximal value of AA xor BB, where AA and BB satisfy the following condition:

L≤A≤B≤RL≤A≤B≤R
Input Format

The input contains two lines; LL is present in the first line and RR in the second line.

Constraints 
1≤L≤R≤101≤L≤R≤103

Output Format

The maximal value as mentioned in the problem statement.

Sample Input
```
10
15
```
Sample Output
```
7
```
Explanation

The input tells us that L=10L=10 and R=15R=15. All the pairs which comply to above condition are the following: 
10⊕10=010⊕10=0 
10⊕11=110⊕11=1 
10⊕12=610⊕12=6 
10⊕13=710⊕13=7 
10⊕14=410⊕14=4 
10⊕15=510⊕15=5 
11⊕11=011⊕11=0 
11⊕12=711⊕12=7 
11⊕13=611⊕13=6 
11⊕14=511⊕14=5 
11⊕15=411⊕15=4 
12⊕12=012⊕12=0 
12⊕13=112⊕13=1 
12⊕14=212⊕14=2 
12⊕15=312⊕15=3 
13⊕13=013⊕13=0 
13⊕14=313⊕14=3 
13⊕15=213⊕15=2 
14⊕14=014⊕14=0 
14⊕15=114⊕15=1 
15⊕15=015⊕15=0 
Here two pairs (10, 13) and (11, 12) have maximum xor value 7, and this is the answer.