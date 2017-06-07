/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:51:15 GMT 2014
 */

package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RandomStringUtilsEvoSuite_branch_Test extends RandomStringUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 32;
      boolean boolean0 = false;
      char char0 = 'h';
      int int1 = (-1);
      String string0 = RandomStringUtils.random((int) char0, int1, int0, boolean0, boolean0);
      assertNotNull(string0);
      assertEquals("\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF\uFFFF", string0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 32;
      boolean boolean0 = false;
      int int1 = 57343;
      char char0 = 'h';
      String string0 = RandomStringUtils.random((int) char0, int1, int0, boolean0, boolean0);
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF\u103FF", string0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 1;
      int int1 = 0;
      boolean boolean0 = true;
      char[] charArray0 = new char[2];
      char char0 = 'W';
      charArray0[0] = char0;
      charArray0[1] = charArray0[0];
      String string0 = RandomStringUtils.random(int0, int0, int1, boolean0, boolean0, charArray0);
      assertNotNull(string0);
      assertEquals("W", string0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new char[] {'W', 'W'}, charArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 1658;
      String string0 = "nz839=Ei3d)6j;Na. ";
      String string1 = RandomStringUtils.random(int0, string0);
  }

  @Test
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[9];
      String string0 = RandomStringUtils.randomAscii((int) charArray0[8]);
      assertNotNull(string0);
      assertEquals("", string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      String string0 = RandomStringUtils.randomAlphabetic(int0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      assertNotNull(randomStringUtils0);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 32;
      String string0 = RandomStringUtils.random(int0);
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 0;
      String string0 = RandomStringUtils.randomAlphanumeric(int0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = (-1416);
      // Undeclared exception!
      try {
        String string0 = RandomStringUtils.randomNumeric(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1416 is less than 0.
         //
      }
  }
}