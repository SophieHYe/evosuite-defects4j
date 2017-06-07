/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:48:02 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NumberUtilsEvoSuite_branch_Test extends NumberUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test000()  throws Throwable  {
      String string0 = "l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test001()  throws Throwable  {
      String string0 = "3f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test002()  throws Throwable  {
      String string0 = "5";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test003()  throws Throwable  {
      String string0 = "--0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test004()  throws Throwable  {
      String string0 = "E/s+2]u{mc:`?-]knQ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test005()  throws Throwable  {
      String string0 = "6eEK-z9gY|B^xe";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test006()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test007()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test008()  throws Throwable  {
      String string0 = "SecurityException occurred";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test009()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test010()  throws Throwable  {
      String string0 = "-0xlahN>J1";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test011()  throws Throwable  {
      String string0 = "0xF3f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test012()  throws Throwable  {
      String string0 = "-0x0.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test013()  throws Throwable  {
      String string0 = "0.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test014()  throws Throwable  {
      String string0 = "C";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test015()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test016()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test017()  throws Throwable  {
      String string0 = "+I";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test018()  throws Throwable  {
      String string0 = "8";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test019()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test020()  throws Throwable  {
      byte byte0 = (byte)24;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.max(byte1, byte1, byte0);
      assertEquals((byte)24, byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte1 == byte2);
      assertTrue(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte2 == byte0);
      assertFalse(byte2 == byte1);
  }

  @Test
  public void test021()  throws Throwable  {
      byte byte0 = (byte)21;
      byte byte1 = (byte)118;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertEquals((byte)118, byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test
  public void test022()  throws Throwable  {
      byte byte0 = (byte)47;
      byte byte1 = (byte)0;
      short short0 = NumberUtils.max((short) byte1, (short) byte1, (short) byte0);
      assertEquals((short)47, short0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test
  public void test023()  throws Throwable  {
      byte byte0 = (byte)47;
      short short0 = (short) (-1);
      short short1 = NumberUtils.max(short0, (short) byte0, (short) byte0);
      assertEquals((short)47, short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
  }

  @Test
  public void test024()  throws Throwable  {
      String string0 = "3S]`I(z+&/5H";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      int int0 = 4481;
      int int1 = NumberUtils.max((int) byte0, (int) byte0, int0);
      assertEquals(4481, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test
  public void test025()  throws Throwable  {
      int int0 = (-3806);
      int int1 = 0;
      int int2 = NumberUtils.max(int0, int1, int1);
      assertEquals(0, int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test
  public void test026()  throws Throwable  {
      long long0 = (-805L);
      long long1 = 0L;
      long long2 = NumberUtils.max(long0, long0, long1);
      assertEquals(0L, long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
  }

  @Test
  public void test027()  throws Throwable  {
      int int0 = (-3806);
      int int1 = NumberUtils.max(int0, int0, int0);
      assertEquals((-3806), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      
      long long0 = 194L;
      byte[] byteArray0 = new byte[1];
      long long1 = NumberUtils.max((long) int1, long0, (long) byteArray0[0]);
      assertEquals(194L, long1);
      assertTrue(long0 == long1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertTrue(long1 == long0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test
  public void test028()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte) (-122);
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertEquals((byte) (-122), byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)32;
      byteArray0[2] = byte0;
      byte byte1 = NumberUtils.min(byteArray0[2], byteArray0[3], byte0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte)0}, byteArray0);
  }

  @Test
  public void test030()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte) (-84);
      short short0 = NumberUtils.min((short) byte0, (short) byte0, (short) byte1);
      assertEquals((short) (-84), short0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test
  public void test031()  throws Throwable  {
      short short0 = (short)1009;
      short short1 = (short)46;
      short short2 = NumberUtils.min(short0, short1, short0);
      assertEquals((short)46, short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
  }

  @Test
  public void test032()  throws Throwable  {
      int int0 = 5;
      int int1 = 0;
      int int2 = NumberUtils.min(int0, int0, int1);
      assertEquals(0, int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
  }

  @Test
  public void test033()  throws Throwable  {
      int int0 = (-1);
      int int1 = (-145);
      int int2 = NumberUtils.min(int0, int1, int1);
      assertEquals((-145), int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test
  public void test034()  throws Throwable  {
      int int0 = 0;
      int int1 = 16;
      short short0 = (short)1905;
      long long0 = NumberUtils.min((long) short0, (long) int1, (long) int0);
      assertEquals(0L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test035()  throws Throwable  {
      int int0 = (-3806);
      int int1 = 0;
      long long0 = NumberUtils.min((long) int1, (long) int0, (long) int0);
      assertEquals((-3806L), long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test036()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = 1607.486F;
      floatArray0[3] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertEquals(1607.486F, float1, 0.01F);
      assertTrue(float1 == float0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 1607.486F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test037()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[4] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test038()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test039()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-1455.94);
      doubleArray0[4] = double0;
      doubleArray0[3] = doubleArray0[4];
      double[] doubleArray1 = new double[7];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray0[3];
      double double1 = NumberUtils.max(doubleArray1);
      assertEquals(0.0, double1, 0.01D);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(double1 == double0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {(-1455.94), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test041()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)32;
      byteArray0[2] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertEquals((byte)32, byte1);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte)0}, byteArray0);
  }

  @Test
  public void test043()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test044()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = (short)305;
      shortArray0[5] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertEquals((short)305, short1);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)305}, shortArray0);
  }

  @Test
  public void test045()  throws Throwable  {
      int[] intArray0 = new int[25];
      int int0 = 1;
      intArray0[7] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertEquals(1, int1);
      assertTrue(int1 == int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test
  public void test046()  throws Throwable  {
      int int0 = 5;
      long[] longArray0 = new long[6];
      longArray0[2] = (long) int0;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(5L, long0);
      assertArrayEquals(new long[] {0L, 0L, 5L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test047()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test048()  throws Throwable  {
      int int0 = (-3806);
      long long0 = NumberUtils.min((long) int0, (long) int0, (long) int0);
      assertEquals((-3806L), long0);
      
      float[] floatArray0 = new float[5];
      floatArray0[1] = (float) long0;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-3806.0F), float0, 0.01F);
      assertArrayEquals(new float[] {0.0F, (-3806.0F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test
  public void test049()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN}, floatArray0, 0.01F);
  }

  @Test
  public void test050()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-1455.94);
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertEquals((-1455.94), double1, 0.01D);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, (-1455.94), 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test
  public void test053()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-75);
      byteArray0[9] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-75), byte1);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-75)}, byteArray0);
  }

  @Test
  public void test055()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short short0 = (short) (-1328);
      shortArray0[1] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertEquals((short) (-1328), short1);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short) (-1328), (short)0}, shortArray0);
  }

  @Test
  public void test057()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test058()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = (-594);
      intArray0[2] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertEquals((-594), int1);
      assertTrue(int1 == int0);
      assertArrayEquals(new int[] {0, 0, (-594)}, intArray0);
  }

  @Test
  public void test059()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test060()  throws Throwable  {
      byte byte0 = (byte)47;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) byte0;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {47L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test
  public void test061()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test
  public void test062()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test
  public void test063()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test
  public void test064()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test
  public void test065()  throws Throwable  {
      String string0 = "lK";
      // Undeclared exception!
      try {
        BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"lK\"
         //
      }
  }

  @Test
  public void test066()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test
  public void test067()  throws Throwable  {
      String string0 = "--Stringscmust not bN null";
      // Undeclared exception!
      try {
        Long long0 = NumberUtils.createLong(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
      }
  }

  @Test
  public void test068()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test
  public void test069()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test
  public void test070()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test
  public void test071()  throws Throwable  {
      String string0 = "...";
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
  public void test072()  throws Throwable  {
      String string0 = "-0";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test073()  throws Throwable  {
      String string0 = "3f";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(3.0F, (float)float0, 0.01F);
  }

  @Test
  public void test074()  throws Throwable  {
      String string0 = "Strings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
      }
  }

  @Test
  public void test075()  throws Throwable  {
      String string0 = "Stringscmust not bN null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Stringscmust not bN null is not a valid number.
         //
      }
  }

  @Test
  public void test076()  throws Throwable  {
      String string0 = "-0f";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertNotNull(bigDecimal0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test
  public void test077()  throws Throwable  {
      String string0 = "mnF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // mnF is not a valid number.
         //
      }
  }

  @Test
  public void test078()  throws Throwable  {
      String string0 = "/CC'wX`6L0E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // /CC'wX`6L0E is not a valid number.
         //
      }
  }

  @Test
  public void test079()  throws Throwable  {
      String string0 = "0.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test
  public void test080()  throws Throwable  {
      String string0 = "Minimu4 ablr4viation width with offset is^7";
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
  public void test081()  throws Throwable  {
      String string0 = "T4U#T2eW][?AE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // T4U#T2eW][?AE is not a valid number.
         //
      }
  }

  @Test
  public void test082()  throws Throwable  {
      String string0 = "InvocationTargetException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // InvocationTargetException occurred is not a valid number.
         //
      }
  }

  @Test
  public void test083()  throws Throwable  {
      String string0 = "java4text.Nrmalizer is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // java4text.Nrmalizer is not available is not a valid number.
         //
      }
  }

  @Test
  public void test084()  throws Throwable  {
      String string0 = "d.o+B7!t mPD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // d.o+B7!t mPD is not a valid number.
         //
      }
  }

  @Test
  public void test085()  throws Throwable  {
      String string0 = "oYg.+pache.comons.lang3.mth.NumberUtils";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // oYg.+pache.comons.lang3.mth.NumberUtils is not a valid number.
         //
      }
  }

  @Test
  public void test086()  throws Throwable  {
      String string0 = "g>X<kL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // g>X<kL is not a valid number.
         //
      }
  }

  @Test
  public void test087()  throws Throwable  {
      String string0 = "0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test
  public void test088()  throws Throwable  {
      String string0 = "-0x%]3V<^=Ku(i-";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-%]3V<^=Ku(i-\"
         //
      }
  }

  @Test
  public void test089()  throws Throwable  {
      String string0 = "0xmF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"mF\"
         //
      }
  }

  @Test
  public void test090() {}
//   @Test
//   public void test090()  throws Throwable  {
//       String string0 = "--Stringscmust not bN null";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test
  public void test091()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test
  public void test092()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test093()  throws Throwable  {
      String string0 = "-0Xjavatext.Nrmalizer is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-javatext.Nrmalizer is not available\"
         //
      }
  }

  @Test
  public void test094()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test095()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test096()  throws Throwable  {
      int int0 = (-145);
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0, (double) int0);
      assertEquals((-145.0), double0, 0.01D);
  }

  @Test
  public void test097()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test098()  throws Throwable  {
      String string0 = "-0";
      short short0 = (short)43;
      short short1 = NumberUtils.min(short0, short0, short0);
      assertEquals((short)43, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      long long0 = NumberUtils.toLong(string0, (long) short1);
      assertEquals(0L, long0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
  }

  @Test
  public void test099()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test
  public void test100()  throws Throwable  {
      String string0 = "g>X<kL";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test101()  throws Throwable  {
      float float0 = (-725.3F);
      float float1 = NumberUtils.max(float0, float0, float0);
      assertEquals((-725.3F), float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test
  public void test102()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test
  public void test103()  throws Throwable  {
      float float0 = Float.NaN;
      float float1 = NumberUtils.min(float0, float0, float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float0 == float1);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test
  public void test104()  throws Throwable  {
      String string0 = "3S]`I(z+&/5H";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      double double0 = NumberUtils.min((double) byte0, (double) byte0, (double) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test105()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test106()  throws Throwable  {
      String string0 = "3S]`I(z+&/5H";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test
  public void test107()  throws Throwable  {
      int int0 = (-1158);
      double double0 = NumberUtils.max((double) int0, (double) int0, (double) int0);
      assertEquals((-1158.0), double0, 0.01D);
  }

  @Test
  public void test108()  throws Throwable  {
      String string0 = "..";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test
  public void test109()  throws Throwable  {
      String string0 = "3S]`I(z+&/5H";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}