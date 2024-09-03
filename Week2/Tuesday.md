# Notes: Tuesday, September 3, 2024

## Bubble Sort 
A Simple Sorting Alg that Repeated steps through the list to be sorted. Compares each pair of adjacent. \
Trying to find out how many things we have to look at. \
O(n^2)

S = 1+2+3+3+...n \
S = n + n-1 + n-2 + n-3 \
2S = n(n+1) \

## Quick Sort Operation
Pick element n and determine if it is larger or smaller than n, do the same with each side and repeat. \ 
The number of calls is doubling at every level, but it is getting half as big. So, the work level is consistent. \
Not any better than bubble sort if you dont add cases to ensure you dont get the worse starting n.

## Identifying Committees
A) The ways the you can select a committee of three people from n people
- (n, n-1, n-2 = n^3)
B) You want to ifind all the possible orderings of a set of candidates\
- (n!)
C) You want to put something on a stack
- (n)
D) Find something in an un ordered array
- (n)
E) Find something in an ordered array
- (log(n))

## Binary Search
log(n)

## Changing Complexity
Performance - Memory and Time Required

Analytical vs Experimental
- Ana - Think about it
  - Advantages: Time Efficient, 
- Exp - Code it

## Max Subsequence
The biggest number you can get when in a set of numbers that are next to each other. \
Take compare numbers, adding more numbers as you continue, and take the absolute value to determine if numbers should or should'nt be in a sequence

## Misc
Log when Doubled add 1
Time Complexities Tend to Discuss Worst

