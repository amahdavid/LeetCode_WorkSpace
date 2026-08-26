# LeetCode Workspace

A focused data structures and algorithms practice repository built around the **NeetCode 150** and software engineering interview preparation.

## Primary language

**C#** is the default language for this repository.

Other languages may be used occasionally for comparison or language practice, but the goal is no longer to solve every problem in every language. The priority is to build strong pattern recognition, communicate solutions clearly, and become faster at solving interview problems in C#.

## Goals

- Complete the NeetCode 150 in C#.
- Learn the underlying problem-solving patterns instead of memorizing solutions.
- Be able to explain brute-force and optimized approaches.
- Track time and space complexity for every important solution.
- Revisit weak problems using spaced repetition.
- Build interview confidence through consistent practice.

## Study order

1. Arrays & Hashing
2. Two Pointers
3. Sliding Window
4. Stack
5. Binary Search
6. Linked List
7. Trees
8. Tries
9. Heap / Priority Queue
10. Backtracking
11. Graphs
12. Advanced Graphs
13. 1-D Dynamic Programming
14. 2-D Dynamic Programming
15. Greedy
16. Intervals
17. Math & Geometry
18. Bit Manipulation

## Problem workflow

For each problem:

1. Read the problem and identify the inputs, outputs, and constraints.
2. Try to recognize the underlying pattern.
3. Write the brute-force approach first if the optimized solution is not obvious.
4. Implement the solution without looking at an answer.
5. Record the time and space complexity.
6. Write a short explanation of the key idea.
7. Mark the problem for review if the solution required significant help.

## Repository structure

```text
LeetCode_WorkSpace/
├── C#/
│   ├── ArraysAndHashing/
│   ├── TwoPointers/
│   ├── SlidingWindow/
│   ├── Stack/
│   ├── BinarySearch/
│   ├── LinkedList/
│   ├── Trees/
│   ├── Tries/
│   ├── HeapPriorityQueue/
│   ├── Backtracking/
│   ├── Graphs/
│   ├── AdvancedGraphs/
│   ├── DynamicProgramming1D/
│   ├── DynamicProgramming2D/
│   ├── Greedy/
│   ├── Intervals/
│   ├── MathAndGeometry/
│   └── BitManipulation/
├── STUDY_PLAN.md
└── README.md
```

Folders will be added as each topic is started rather than creating a large empty directory tree up front.

## Solution format

Each important solution should include a short header similar to:

```csharp
// Problem: Two Sum
// Pattern: Hash Map
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(n)
//
// Key idea:
// Store previously seen values and their indices in a dictionary.
// For each number, check whether its complement already exists.
```

The code should remain readable enough that the approach can be explained during an interview without relying on comments.

## Progress

The detailed study plan and progress tracker live in [`STUDY_PLAN.md`](STUDY_PLAN.md).

## Practice philosophy

The objective of this repository is not GitHub activity for its own sake. It is to become better at recognizing common algorithmic patterns, writing correct code under interview constraints, and clearly explaining engineering tradeoffs.
