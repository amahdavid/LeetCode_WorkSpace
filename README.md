# LeetCode Workspace

A data structures and algorithms practice repository built around the **NeetCode 150** and software engineering interview preparation.

## Philosophy: solution first, syntax second

The main goal of this repository is to get better at **recognizing patterns and designing correct solutions**, independent of programming language syntax.

Modern development tools can help with syntax, but they cannot replace understanding the algorithm. The workflow here is therefore:

1. Understand the problem.
2. Identify the pattern or data structure.
3. Work out the solution in plain language or pseudocode.
4. Analyze time and space complexity.
5. Implement the solution in one language.
6. Translate it into other languages when useful to reinforce portability and syntax familiarity.

The languages in this repository are implementation tools, not separate study tracks.

## Languages

Current implementations may use:

- C#
- Java
- Python
- JavaScript
- C++

There is no requirement to become a syntax expert in every language before solving problems. The priority is being able to explain the algorithm clearly and then express that algorithm in code.

## Goals

- Complete the NeetCode 150.
- Build strong recognition of common algorithmic patterns.
- Be able to explain brute-force and optimized approaches before coding.
- Separate algorithmic thinking from language-specific syntax.
- Translate known solutions between languages to build adaptability.
- Track time and space complexity for important solutions.
- Revisit weak problems using spaced repetition.
- Build confidence for technical interviews.

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

1. Read the problem and identify inputs, outputs, and constraints.
2. Describe a straightforward solution before worrying about syntax.
3. Identify the underlying pattern.
4. Improve the approach if there is a better time/space tradeoff.
5. State the expected time and space complexity.
6. Implement the solution in a language of choice.
7. Translate it into additional languages when that adds learning value.
8. Mark the problem for review if significant help was required.

## Repository structure

The existing language folders are preserved because they already contain useful solutions. Within each language, problems are grouped by NeetCode topic.

```text
LeetCode_WorkSpace/
├── C#/
├── C++/
├── Java/
├── JavaScript/
├── Python/
├── STUDY_PLAN.md
└── README.md
```

The long-term goal is consistency across languages: the same topic names, problem names, and algorithmic reasoning should map cleanly between implementations.

## Existing progress

The repository already contains multi-language implementations of early Arrays & Hashing problems such as:

- Contains Duplicate
- Valid Anagram
- Two Sum

Java also contains an early Two Pointers implementation for Valid Palindrome.

These existing solutions are being preserved rather than replaced.

## Solution notes

For important problems, record the language-independent reasoning before or alongside the code:

```text
Problem: Two Sum
Pattern: Hash Map

Idea:
Store values seen so far and their indices.
For each number, calculate the complement needed to reach the target.
If the complement has already been seen, return the two indices.

Time: O(n)
Space: O(n)
```

Then implement that same idea using the idioms of the selected language.

## Progress

The study routine and progress tracker live in [`STUDY_PLAN.md`](STUDY_PLAN.md).

## What success looks like

The objective is not to memorize hundreds of code snippets or manufacture GitHub activity. Success means being able to look at an unfamiliar problem, reason toward a solution, explain why it works, evaluate its complexity, and then turn that solution into working code even if some language-specific syntax needs to be looked up or assisted by tooling.
