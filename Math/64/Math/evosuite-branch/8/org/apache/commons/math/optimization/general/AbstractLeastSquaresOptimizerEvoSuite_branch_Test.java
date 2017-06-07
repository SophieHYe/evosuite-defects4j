/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:33:07 GMT 2014
 */

package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test extends AbstractLeastSquaresOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      int int0 = 722;
      gaussNewtonOptimizer0.rows = int0;
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      int int0 = (-1209);
      gaussNewtonOptimizer0.setMaxEvaluations(int0);
      assertEquals(-1209, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        gaussNewtonOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = (-263);
      levenbergMarquardtOptimizer0.setMaxIterations(int0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(-263, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      try {
        levenbergMarquardtOptimizer0.incrementIterationsCounter();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (-263) exceeded
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      SimpleVectorialValueChecker simpleVectorialValueChecker0 = (SimpleVectorialValueChecker)gaussNewtonOptimizer0.getConvergenceChecker();
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertNotNull(simpleVectorialValueChecker0);
  }

  @Test
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, int0);
  }

  @Test
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertNotNull(gaussNewtonOptimizer0);
      
      double double0 = gaussNewtonOptimizer0.getRMS();
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      int int0 = gaussNewtonOptimizer0.getIterations();
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = levenbergMarquardtOptimizer0.getEvaluations();
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Integer.MAX_VALUE, int0);
  }
}