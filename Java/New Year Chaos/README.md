New Year Chaos
=============

It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride!

There are  people queued up, and each person wears a sticker indicating their initial position in the queue (i.e.:  with the first number denoting the frontmost position).

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original place in line. One person can bribe at most two other persons.

That is to say, if  and  bribes , the queue will look like this: .

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

Note: Each  wears sticker , meaning they were initially the  person in queue.

Input Format

The first line contains an integer, , denoting the number of test cases. 
Each test case is comprised of two lines; the first line has  (an integer indicating the number of people in the queue), and the second line has  space-separated integers describing the final state of the queue.

Constraints



Subtasks

For  score 
For  score 

Output Format

Print an integer denoting the minimum number of bribes needed to get the queue into its final state; print Too chaotic if the state is invalid (requires  to bribe more than  people).

Sample Input
```
2
5
2 1 5 3 4
5
2 5 1 3 4
```
Sample Output
```
3
Too chaotic
```