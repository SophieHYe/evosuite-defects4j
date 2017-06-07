/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:40:47 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NumberUtilsEvoSuite_branch_Test extends NumberUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "7l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "9e~";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = ".f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "--~^t";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "+Wpx>GzzI\"1p kK;B5";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "EDL39vbU]K7";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "9e0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "--";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "-0xCanot pad a negativ* amount ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "0x0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "0hvHI'r@CP)L~5{";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "-0x6#|_\\E/.t;,E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "..>";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = "0hvHI'r@CP)L~5{";
      int int0 = NumberUtils.stringToInt(string0);
      assertEquals(0, int0);
      
      float float0 = (-1663.8048F);
      int int1 = NumberUtils.compare((float) int0, float0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, int1);
  }

  @Test
  public void test25()  throws Throwable  {
      long long0 = (-457L);
      float float0 = 1.0F;
      int int0 = NumberUtils.compare((float) long0, float0);
      assertEquals((-1), int0);
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = 0;
      int int1 = NumberUtils.maximum(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
      
      int int2 = NumberUtils.compare((double) int1, (double) int1);
      assertTrue(int1 == int2);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertTrue(int0 == int2);
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, int2);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = 1103;
      double double0 = 0.0;
      int int1 = NumberUtils.compare(double0, (double) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
  }

  @Test
  public void test28()  throws Throwable  {
      float float0 = 1.0F;
      int int0 = NumberUtils.compare(float0, float0);
      assertEquals(0, int0);
      
      int int1 = NumberUtils.compare((double) float0, (double) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, int1);
  }

  @Test
  public void test29()  throws Throwable  {
      int int0 = (-2460);
      int int1 = 1414;
      int int2 = NumberUtils.maximum(int0, int0, int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(1414, int2);
  }

  @Test
  public void test30()  throws Throwable  {
      int int0 = (-2460);
      int int1 = 120;
      int int2 = NumberUtils.maximum(int0, int1, int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertEquals(120, int2);
  }

  @Test
  public void test31()  throws Throwable  {
      int int0 = 0;
      int int1 = 204;
      int int2 = NumberUtils.minimum(int1, int0, int0);
      assertTrue(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertEquals(0, int2);
      
      long long0 = NumberUtils.maximum((long) int2, (long) int1, (long) int2);
      assertTrue(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertEquals(204L, long0);
  }

  @Test
  public void test32()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      int int2 = 204;
      int int3 = NumberUtils.minimum(int0, int2, int1);
      assertTrue(int1 == int3);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int3);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertTrue(int3 == int1);
      assertEquals((-1), int3);
  }

  @Test
  public void test33()  throws Throwable  {
      long long0 = 412L;
      long long1 = 1318L;
      long long2 = NumberUtils.maximum(long0, long0, long1);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertEquals(1318L, long2);
      
      long long3 = NumberUtils.minimum(long1, long2, long0);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long1 == long3);
      assertFalse(long3 == long1);
      assertTrue(long3 == long0);
      assertFalse(long3 == long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long0 == long3);
      assertTrue(long2 == long1);
      assertFalse(long2 == long3);
      assertFalse(long2 == long0);
      assertEquals(412L, long3);
  }

  @Test
  public void test34()  throws Throwable  {
      long long0 = (-457L);
      long long1 = (-1123L);
      long long2 = NumberUtils.minimum(long0, long1, long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertEquals((-1123L), long2);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = ".(\"Bylh<)0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "0E7";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertEquals(0, bigDecimal0.byteValue());
      assertEquals(0, bigDecimal0.shortValue());
      assertNotNull(bigDecimal0);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "7l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(7L, (long)long0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "@.:Q9*IJa},l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // @.:Q9*IJa},l is not a valid number.
         //
      }
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = ";t%f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ;t%f is not a valid number.
         //
      }
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = "4d";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(4.0, (double)double0, 0.01D);
  }

  @Test
  public void test41()  throws Throwable  {
      String string0 = ",9n$f/[{'{QL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ,9n$f/[{'{QL is not a valid number.
         //
      }
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = "oE n&P\"ta!;8YKsD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // oE n&P\"ta!;8YKsD is not a valid number.
         //
      }
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = "0EOwS?\\F]<vhau)|";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EOwS?\\F]<vhau)| is not a valid number.
         //
      }
  }

  @Test
  public void test44()  throws Throwable  {
      String string0 = "0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
      }
  }

  @Test
  public void test45()  throws Throwable  {
      String string0 = "Strings Ist notbe null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings Ist notbe null is not a valid number.
         //
      }
  }

  @Test
  public void test46()  throws Throwable  {
      String string0 = "i7 not  valid#number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // i7 not  valid#number. is not a valid number.
         //
      }
  }

  @Test
  public void test47()  throws Throwable  {
      String string0 = "6#|*_'.t;,.|E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 6#|*_'.t;,.|E is not a valid number.
         //
      }
  }

  @Test
  public void test48()  throws Throwable  {
      String string0 = "-0xa}uMWMD(9";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-a}uMWMD(9\"
         //
      }
  }

  @Test
  public void test49()  throws Throwable  {
      String string0 = "0x0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test50()  throws Throwable  {
      String string0 = "--";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test51()  throws Throwable  {
      String string0 = "0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test52()  throws Throwable  {
      String string0 = "-";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // - is not a valid number.
         //
      }
  }

  @Test
  public void test53()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
      }
  }

  @Test
  public void test54()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test55()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test56()  throws Throwable  {
      String string0 = "1eE7";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"1eE7\"
         //
      }
  }

  @Test
  public void test57()  throws Throwable  {
      String string0 = "&}Ky`YUIYMXg>S@ob.hF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // &}Ky`YUIYMXg>S@ob.hF is not a valid number.
         //
      }
  }
}