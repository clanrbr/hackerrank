Larry's Array
=============

Larry has a permutation of NN numbers, AA, whose unique elements range from 11 to NN (i.e.: A={a1,a2,…,aN−1,aN}A={a1,a2,…,aN−1,aN}). He wants AA to be sorted, so he delegates the task of doing so to his robot. The robot can perform the following operation as many times as it wants:

Choose any 33 consecutive indices and rotate their elements in such a way that ABCABC rotates to BCABCA, which rotates to CABCAB, which rotates back to ABCABC.
For example: if A={1,6,5,2,4,3}A={1,6,5,2,4,3} and the robot rotates (6,5,2)(6,5,2), AA becomes {1,5, 2, 6,4,3}{1,5, 2, 6,4,3}.

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Input Format

The first line contains an integer, TT, the number of test cases. 
The 2T2T subsequent lines each describe a test case over 22 lines:

An integer, NN, denoting the size of AA.
NN space-separated integers describing AA, where the ithith value describes element aiai.
Constraints

1≤T≤101≤T≤10
3≤N≤10003≤N≤1000
1≤ai≤N, where every element ai is unique.1≤ai≤N, where every element ai is unique.
Output Format

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Sample Input
```
3
3
3 1 2
4
1 3 4 2
5
1 2 3 5 4
```
Sample Output
```
YES
YES
NO
```
Explanation

In the explanation below, the subscript of AA denotes the number of operations performed.

Test Case 0: 
A0={3,1,2}→rotate(3,1,2)→A1={1,2,3}A0={3,1,2}→rotate(3,1,2)→A1={1,2,3} 
AA is now sorted, so we print YESYES on a new line.

Test Case 1: 
A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}. 
A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}. 
AA is now sorted, so we print YESYES on a new line.

Test Case 2:
No sequence of rotations will result in a sorted AA. Thus, we print NONO on a new line.