Plus Minus
=============

Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10−410−4 are acceptable.

Input Format

The first line contains an integer, NN, denoting the size of the array. 
The second line contains NN space-separated integers describing an array of numbers (a0,a1,a2,…,an−1)(a0,a1,a2,…,an−1).

Output Format

You must print the following 33 lines:

A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
Sample Input
```
6
-4 3 -9 0 4 1         
```
Sample Output
```
0.500000
0.333333
0.166667
```
Explanation

There are 33 positive numbers, 22 negative numbers, and 11 zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are 36=0.50000036=0.500000, 26=0.33333326=0.333333 and 16=0.16666716=0.166667, respectively.