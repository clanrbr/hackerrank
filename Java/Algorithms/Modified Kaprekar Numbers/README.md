Modified Kaprekar Numbers
=============

A modified Kaprekar number is a positive whole number nn with dd digits, such that when we split its square into two pieces - a right hand piece rr with dd digits and a left hand piece ll that contains the remaining dd or d−1d−1 digits, the sum of the pieces is equal to the original number (i.e. ll + rr = nn).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers pp and qq, where pp is lower than qq. Write a program to determine how many Kaprekar numbers are there in the range between pp and qq (both inclusive) and display them all.

Input Format

There will be two lines of input: pp, lowest value qq, highest value

Constraints: 
0<p<q<1000000<p<q<100000
Output Format

Output each Kaprekar number in the given range, space-separated on a single line. If no Kaprekar numbers exist in the given range, print INVALID RANGE.

Sample Input
```
1
100
```
Sample Output
```
1 9 45 55 99
```
Explanation

11, 99, 4545, 5555, and 9999 are the Kaprekar Numbers in the given range.