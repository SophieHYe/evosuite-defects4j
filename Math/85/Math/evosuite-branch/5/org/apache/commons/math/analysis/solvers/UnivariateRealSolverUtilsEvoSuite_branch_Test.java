/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:00:34 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test extends UnivariateRealSolverUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      UnivariateRealFunction univariateRealFunction0 = null;
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, doubleArray0[2], doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1751.467445633;
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1751.467445633, 1751.467445633, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      double double1 = Double.POSITIVE_INFINITY;
      int int0 = 1782;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[0], double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,782, maximum iterations=1,782, initial=1,751.467, lower bound=1,751.467, upper bound=\u221E, final a value=1,751.467, final b value=3,533.467, f(a)=3,069,389.681, f(b)=6,190,504.669
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1958.39008202232;
      doubleArray0[1] = double0;
      double double1 = 0.5;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 1958.39008202232, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      int int0 = 1782;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double1, double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1,782, maximum iterations=1,782, initial=1,958.39, lower bound=0.5, upper bound=1,958.39, final a value=176.39, final b value=1,958.39, f(a)=345,440.587, f(b)=3,835,291.713
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1751.467445633;
      double double1 = 1958.39008202232;
      doubleArray0[1] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 1958.39008202232, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(1, polynomialFunction0.degree());
      
      int int0 = 1782;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=207, maximum iterations=1,782, initial=1,958.39, lower bound=1,751.467, upper bound=1,958.39, final a value=1,751.467, final b value=1,958.39, f(a)=3,430,056.475, f(b)=3,835,291.713
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = 1751.467445633;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      int int0 = 1782;
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[2], double0, int0);
      assertArrayEquals(new double[] {0.0, 1.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertEquals(0, polynomialFunction0.degree());
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = (-324.2457787080562);
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, (-324.2457787080562), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertEquals(7, polynomialFunctionLagrangeForm0.degree());
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, doubleArray0[6], doubleArray0[1], doubleArray0[5]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=-324.246
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 609.90209039618;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=609.902,  initial=0, upper bound=0
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-1443.676207221766);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      int int0 = (-1);
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[4], double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -1
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = 104.8041;
      UnivariateRealFunction univariateRealFunction0 = null;
      int int0 = 4;
      // Undeclared exception!
      try {
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], doubleArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[0], doubleArray0[0], doubleArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertEquals(7, polynomialFunctionLagrangeForm0.degree());
      
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, doubleArray0[6], doubleArray0[1], doubleArray0[5]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = (-3093.0);
      double double1 = UnivariateRealSolverUtils.midpoint(double0, double0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals((-3093.0), double1, 0.01D);
  }
}