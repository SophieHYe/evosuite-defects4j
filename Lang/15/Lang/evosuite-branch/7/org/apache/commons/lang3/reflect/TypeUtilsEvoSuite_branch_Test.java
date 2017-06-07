/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:49:38 GMT 2014
 */

package org.apache.commons.lang3.reflect;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypeUtilsEvoSuite_branch_Test extends TypeUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = TypeUtils.getArrayComponentType((Type) class0);
      assertNull(type0);
      
      boolean boolean0 = TypeUtils.isArrayType(type0);
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = TypeUtils.isArrayType((Type) class0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      Class<?> class2 = TypeUtils.getRawType((Type) class0, (Type) class1);
      assertEquals(false, class2.isArray());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(17, class2.getModifiers());
      assertNotNull(class2);
  }

  @Test
  public void test03()  throws Throwable  {
      Type[] typeArray0 = new Type[9];
      // Undeclared exception!
      try {
        Class<?> class0 = TypeUtils.getRawType(typeArray0[4], typeArray0[4]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      assertNotNull(map0);
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      assertTrue(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertSame(typeArray1, typeArray0);
      assertSame(typeArray0, typeArray1);
      assertNotNull(typeArray1);
  }

  @Test
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = TypeUtils.isInstance((Object) class0, (Type) class0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      Type type0 = null;
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
      
      boolean boolean0 = TypeUtils.isInstance((Object) type0, type1);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      Class<Method> class0 = Method.class;
      String string0 = null;
      boolean boolean0 = TypeUtils.isInstance((Object) string0, (Type) class0);
      assertTrue(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      Class<TypeVariable> class0 = TypeVariable.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
      assertNotNull(map0);
  }

  @Test
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<TypeVariable> class1 = TypeVariable.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertNull(map0);
  }

  @Test
  public void test11()  throws Throwable  {
      Type type0 = null;
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try {
        Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(type0, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type[] typeArray0 = new Type[9];
      typeArray0[2] = (Type) class0;
      assertNotNull(typeArray0[2]);
      
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertNotSame(typeArray0, typeArray1);
      assertNotSame(typeArray1, typeArray0);
      assertFalse(typeArray0.equals((Object)typeArray1));
      assertFalse(typeArray1.equals((Object)typeArray0));
      assertNotNull(typeArray1);
  }

  @Test
  public void test13()  throws Throwable  {
      Type type0 = null;
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
      
      boolean boolean0 = TypeUtils.isAssignable(type1, type1);
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      assertNotNull(typeUtils0);
  }
}