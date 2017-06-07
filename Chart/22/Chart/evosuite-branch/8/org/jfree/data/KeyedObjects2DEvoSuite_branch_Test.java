/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:51:24 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class KeyedObjects2DEvoSuite_branch_Test extends KeyedObjects2DEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
  }

  @Test
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      String string0 = "aR>";
      keyedObjects2D1.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 15;
      Object object0 = null;
      keyedObjects2D0.setObject(object0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      String string0 = "qKhM\\S??MU,";
      keyedObjects2D1.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-11);
      Object object0 = null;
      keyedObjects2D0.setObject(object0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      String string0 = null;
      keyedObjects2D1.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-2229);
      int int1 = 0;
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      String string0 = "qKhM\\S??MU,";
      keyedObjects2D1.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(int0 == int1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      KeyedObjects keyedObjects0 = new KeyedObjects();
      assertEquals(0, keyedObjects0.getItemCount());
      assertNotNull(keyedObjects0);
      
      int int0 = (-1188);
      String string0 = Integer.toBinaryString(int0);
      assertEquals("11111111111111111111101101011100", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects0, (Comparable) string0, (Comparable) string0);
      assertEquals(0, keyedObjects0.getItemCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
  }

  @Test
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-41);
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals((-41), (int)integer0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) integer0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertTrue(integer0.equals((Object)int0));
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      KeyedObjects keyedObjects0 = new KeyedObjects();
      assertEquals(0, keyedObjects0.getItemCount());
      assertNotNull(keyedObjects0);
      
      int int0 = (-1188);
      String string0 = Integer.toBinaryString(int0);
      assertEquals("11111111111111111111101101011100", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects0, (Comparable) string0, (Comparable) string0);
      assertEquals(0, keyedObjects0.getItemCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int1 = 0;
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeColumn(int1);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
  }

  @Test
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = Integer.MIN_VALUE;
      assertEquals(Integer.MIN_VALUE, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (-2147483648) not recognised.
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = (-1);
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (-1) not recognised.
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals((-1), int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = keyedObjects2D0.getColumnIndex((Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals((-1), int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
  }

  @Test
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      String string0 = integer0.toString();
      assertTrue(integer0.equals((Object)int0));
      assertEquals("0", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) integer0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.removeObject((Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertTrue(integer0.equals((Object)int0));
  }

  @Test
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-275);
      String string0 = Integer.toBinaryString(int0);
      assertEquals("11111111111111111111111011101101", string0);
      assertNotNull(string0);
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeObject((Comparable) string0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.addObject(object0, comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(871, int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertSame(keyedObjects2D0, keyedObjects2D1);
      assertSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
  }

  @Test
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      
      Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertNull(object0);
  }

  @Test
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (0) not recognised.
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-394);
      String string0 = Integer.toHexString(int0);
      assertEquals("fffffe76", string0);
      assertNotNull(string0);
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      Comparable<KeyedObjects> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertTrue(boolean0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) boolean0, (Comparable) boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (true) not recognised.
         //
      }
  }

  @Test
  public void test22()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "Lwc|,@B9qqAN/)./";
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int0 = keyedObjects2D0.getRowIndex((Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      
      int int1 = keyedObjects2D0.getColumnIndex((Comparable) int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      Object object0 = keyedObjects2D0.getObject(int1, int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNull(object0);
  }

  @Test
  public void test23()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      int int0 = 19;
      keyedObjects2D0.addObject(object0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      String string0 = "qKhM\\S??MU,";
      keyedObjects2D1.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
  }

  @Test
  public void test24()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      // Undeclared exception!
      try {
        Comparable comparable0 = keyedObjects2D0.getRowKey(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      int int0 = (-1);
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      keyedObjects2D0.removeRow((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }
}