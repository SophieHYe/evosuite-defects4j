/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 07:13:33 GMT 2014
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
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      KeyedObjects2D keyedObjects2D2 = null;
      keyedObjects2D1.addObject((Object) keyedObjects2D2, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      String string0 = "Column key (";
      keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D1.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(int0 == int1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      String string0 = "idOjbn;e07zv/D4;V>";
      keyedObjects2D0.addObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = Integer.MAX_VALUE;
      assertEquals(Integer.MAX_VALUE, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (2147483647) not recognised.
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (0) not recognised.
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 27;
      int int1 = keyedObjects2D0.hashCode();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      assertEquals(871, int1);
      
      String string0 = Integer.toOctalString(int0);
      assertFalse(int0 == int1);
      assertNotNull(string0);
      assertEquals("33", string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 1;
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      String string0 = Integer.toString(int0);
      assertFalse(int0 == int1);
      assertNotNull(string0);
      assertEquals("1", string0);
      
      keyedObjects2D0.addObject((Object) string0, (Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      keyedObjects2D0.removeObject((Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
  }

  @Test
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-12);
      String string0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Comparable<String> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject(object0, comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = "idOjbn;e07zv/D4;V>";
      keyedObjects2D0.addObject((Object) string0, (Comparable) int1, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int1);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertNull(object0);
  }

  @Test
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      int int1 = keyedObjects2D1.getRowIndex((Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertEquals((-1), int1);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (-1) not recognised.
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 24;
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D1);
      assertSame(keyedObjects2D1, keyedObjects2D0);
      assertSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 24;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (24) not recognised.
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = null;
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2232;
      Comparable<KeyedObjects> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      String string0 = "idOjbn;e07zv/D4;V>";
      keyedObjects2D0.addObject((Object) string0, (Comparable) int1, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int1);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      keyedObjects2D1.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      String string0 = "Column key (";
      keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
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
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 1;
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Integer.toString(int0);
      assertFalse(int0 == int1);
      assertNotNull(string0);
      assertEquals("1", string0);
      
      keyedObjects2D0.addObject((Object) string0, (Comparable) int0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.setObject((Object) string0, (Comparable) int1, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeColumn(int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
  }

  @Test
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      keyedObjects2D0.removeRow((Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
  }
}