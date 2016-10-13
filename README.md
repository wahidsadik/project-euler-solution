# Project Euler Solutions

My attempt to keep myself fit by solving [Project Euler](https://projecteuler.net) problems.

## Guidelines for solution

I am setting few soft guidelines for myself when creating solutions:

- Separate package for each problem.
- Name the first solution as `Solution.java`. For subsequent solutions, named them as `Solution1.java`, etc.
- There should be `main()` method to help run from command-line. Have a `solve()` instance method that finds the actual solution.
- Write unit-tests, and verify primary results.
- Use Java 8 and functional approach as much as possible.

## How to run locally

Prerequisite

- Java 8
- Gradle 3.1

To run:

- `$ ./gradlew wrapper` # Optional

To run particular from command line:

- `$ ./gradlew clean jar && java -cp build/libs/project-euler-solutions.jar com.wsadik.euler.problem0001.Solution 10`
