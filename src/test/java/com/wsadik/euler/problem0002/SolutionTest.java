package com.wsadik.euler.problem0002;

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
    assertEquals(0, solution.solve(0));
    assertEquals(0, solution.solve(1));
    assertEquals(2, solution.solve(2));
    assertEquals(10, solution.solve(8));
  }

  @Test
  public void testMain() throws IOException {
    //setup
    PrintStream stored = System.out;

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    //execute
    Solution.main(new String[] { "8" });
    System.setOut(stored);

    //verify
    BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(baos.toByteArray())));

    assertEquals(10, Long.parseLong(br.readLine()));

    br.close();
  }

}
