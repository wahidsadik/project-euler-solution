package com.wsadik.euler.problem0001;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
  Link: https://projecteuler.net/problem=1

  Multiples of 3 and 5

  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.

 */
public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solve(Integer.parseInt(args[0])));
  }

  public long solve(int range) {
    return IntStream.range(0, range)
      .filter(i -> (i%3 == 0) || (i%5 == 0))
      .sum();
  }

}
