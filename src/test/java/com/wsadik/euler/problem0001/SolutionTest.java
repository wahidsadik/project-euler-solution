package com.wsadik.euler.problem0001;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testSolve() {
    Solution solution = new Solution();
    assertEquals(0, solution.solve(2));
    assertEquals(3, solution.solve(4));
    assertEquals(8, solution.solve(6));
    assertEquals(14, solution.solve(7));
    assertEquals(23, solution.solve(10));
  }

  @Test
  public void testMain() throws IOException {
    //setup
    PrintStream stored = System.out;

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    //execute
    Solution.main(new String[] { "10" });
    System.setOut(stored);

    //verify
    BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(baos.toByteArray())));

    assertEquals(23, Long.parseLong(br.readLine()));

    br.close();
  }

}
