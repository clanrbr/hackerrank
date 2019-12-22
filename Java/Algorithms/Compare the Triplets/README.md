Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet a = (a0,a1,a2), and the rating for Bob's challenge to be the triplet b = (b0, b1, b2).

Your task is to find their comparison points by comparing a0 with b0, a1 with b1, and a2 with b2.

If ai> bi, then Alice is awarded 1 point.
If ai< bi, then Bob is awarded 1 point.
If ai=bi, then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

For example, a = [1,2,3] and b = [3,2,1]. For elements 0, Bob is awarded a point because a0 < b0. For the equal elements a1 and b1, no points are earned. Finally, for elements 2, a2 > b2  so Alice receives a point. Your return array would be [1,1] with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

a: an array of integers representing Alice's challenge rating
b: an array of integers representing Bob's challenge rating
Input Format

The first line contains 3 space-separated integers, a0, a1, and a2, describing the respective values in triplet a.
The second line contains 3 space-separated integers, b0, b1, and b2, describing the respective values in triplet b.

Constraints
1<=ai<=100
1<=bi<=100
Output Format

Return an array of two integers denoting the respective comparison points earned by Alice and Bob.

Sample Input 0
```
5 6 7
3 6 10
```
Sample Output 0
```
1 1
```
Explanation 0

In this example:
a = (a0,a1,a2) = (5,6,7)
b = (b0,b1,b2) = (3,6,10)
Now, let's compare each individual score:

a0 > b0, so Alice receives 1 point.
a1 = b1, so nobody receives a point.
a2 < b2, so Bob receives 1 point.
Alice's comparison score is 1, and Bob's comparison score is 1. Thus, we return the array [1,1].

Sample Input 1
````
17 28 30
99 16 8
```
Sample Output 1
```
2 1
```
Explanation 1

Comparing the 0th elements, 17 < 99 so Bob receives a point.
Comparing the 1st and 2nd elements, 28 > 16  and 30 > 8 so Alice receives two points.
The return array is [2,1].