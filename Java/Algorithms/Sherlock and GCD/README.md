Sherlock and GCD
=============

Sherlock is stuck while solving a problem: Given an array A={a1,a2,⋯,aN}A={a1,a2,⋯,aN}, he wants to know if there exists a subset BB of this array which follows these statements:

BB is a non-empty subset.
There exists no integer x(x>1)x(x>1) which divides all elements of BB.
There are no elements of BB which are equal to another.
Input Format

The first line of input contains an integer, TT, representing the number of test cases. Then TT test cases follow. 
Each test case consists of two lines. The first line contains an integer, NN, representing the size of array AA. In the second line there are NN space-separated integers, a1,a2,…,ana1,a2,…,an, representing the elements of array AA.

Constraints 
1≤T≤101≤T≤10 
1≤N≤1001≤N≤100 
1≤ai≤105 ∀1≤i≤N1≤ai≤105 ∀1≤i≤N

Output Format

Print YES if such a subset exists; otherwise, print NO.

Sample Input
```
3
3
1 2 3
2
2 4
3
5 5 5
```
Sample Output
```
YES
NO
NO
```
Explanation

In the first test case, {1},{2},{3},{1,2},{1,3},{2,3} and {1,2,3}{1},{2},{3},{1,2},{1,3},{2,3} and {1,2,3} are all the possible non-empty subsets, of which the first and the last four satisfy the given condition.

For the second test case, all possible subsets are {2},{4},{2,4}{2},{4},{2,4}. For all of these subsets, x=2x=2 divides each element. Therefore, no non-empty subset exists which satisfies the given condition.

For the third test case, the following subsets exist: SS1={5},S={5},S2={5,5}, and S={5,5}, and S3={5,5,5}={5,5,5}. Because the single element in the first subset is divisible by 55 and the other two subsets have elements that are equal to another, there is no subset that satisfies every condition.