/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 07:16:19 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Asinh;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentOptimizerEvoSuite_branch_Test extends BrentOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 1086.8721034917864;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      
      int int0 = 2525;
      double[] doubleArray0 = new double[25];
      doubleArray0[12] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2525.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) polynomialFunction0, goalType0, doubleArray0[3], (double) int0, doubleArray0[1]);
      assertNotNull(univariatePointValuePair0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2525.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(12, polynomialFunction0.degree());
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(2525, brentOptimizer0.getMaxEvaluations());
      assertEquals(2525.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(2, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 1086.8721034917864;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      int int0 = 2525;
      double[] doubleArray0 = new double[25];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) polynomialFunction0, goalType0, doubleArray0[4], doubleArray0[19]);
      assertNotNull(univariatePointValuePair0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(2525, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 3197.367048372078;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      
      double double1 = brentOptimizer0.getMax();
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
      
      double double2 = 5.0;
      assertFalse(double2 == double1);
      
      BrentOptimizer brentOptimizer1 = new BrentOptimizer(double2, double2);
      assertNotNull(brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertNull(brentOptimizer1.getGoalType());
      assertEquals(0, brentOptimizer1.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer1.getMax(), 0.01D);
      assertEquals(0, brentOptimizer1.getEvaluations());
      assertEquals(0.0, brentOptimizer1.getMin(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      
      int int0 = 467;
      Inverse inverse0 = new Inverse();
      assertNotNull(inverse0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double3 = (-2425.174942456793);
      assertFalse(double3 == double1);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer1.optimize(int0, (UnivariateFunction) inverse0, goalType0, double3, double0, double1);
      assertNotNull(univariatePointValuePair0);
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(Double.POSITIVE_INFINITY, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(3197.367048372078, brentOptimizer1.getMax(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer1.getGoalType());
      assertEquals((-2425.174942456793), brentOptimizer1.getMin(), 0.01D);
      assertEquals(13, brentOptimizer1.getEvaluations());
      assertEquals(0.0, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(467, brentOptimizer1.getMaxEvaluations());
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 0.4909;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      
      int int0 = 2880;
      Asinh asinh0 = new Asinh();
      assertNotNull(asinh0);
      
      UnivariateFunction univariateFunction0 = asinh0.derivative();
      assertNotNull(univariateFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double1 = (-1027.578772115272);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, (double) int0, double1);
      assertNotNull(univariatePointValuePair0);
      assertEquals(0.9852826376271236, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.17348635961732106, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(926.210613942364, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(2880.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(2880, brentOptimizer0.getMaxEvaluations());
      assertEquals((-1027.578772115272), brentOptimizer0.getMax(), 0.01D);
      assertEquals(14, brentOptimizer0.getEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 0.18492233753204346;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNotNull(brentOptimizer0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      
      int int0 = 1474;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      UnivariateFunction univariateFunction0 = cos0.derivative();
      assertNotNull(univariateFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double1 = (-1417.30894);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, (double) int0, double1);
      assertNotNull(univariatePointValuePair0);
      assertEquals((-397.3468634455336), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0.9979136785449584, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(1474, brentOptimizer0.getMaxEvaluations());
      assertEquals(1474.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals((-1417.30894), brentOptimizer0.getMax(), 0.01D);
      assertEquals(28.345530000000053, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(5, brentOptimizer0.getEvaluations());
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 2440.920486619266;
      double double1 = (-1886.8814978316814);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,886.881 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = (-202.97691477552);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -202.977 is smaller than the minimum (0)
         //
      }
  }
}