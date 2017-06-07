/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:14:15 GMT 2014
 */

package org.apache.commons.math.estimation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationException;
import org.apache.commons.math.estimation.EstimationProblem;
import org.apache.commons.math.estimation.GaussNewtonEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractEstimatorEvoSuite_branch_Test extends AbstractEstimatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      try {
        double[] doubleArray0 = levenbergMarquardtEstimator0.guessParametersErrors((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-35);
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      String string0 = "?/wQ'";
      EstimatedParameter estimatedParameter0 = new EstimatedParameter(string0, (double) int0);
      assertNotNull(estimatedParameter0);
      assertEquals((-35.0), estimatedParameter0.getEstimate(), 0.01D);
      assertEquals(false, estimatedParameter0.isBound());
      assertEquals("?/wQ'", estimatedParameter0.getName());
      
      simpleEstimationProblem0.addParameter(estimatedParameter0);
      assertEquals((-35.0), estimatedParameter0.getEstimate(), 0.01D);
      assertEquals(false, estimatedParameter0.isBound());
      assertEquals("?/wQ'", estimatedParameter0.getName());
      
      try {
        double[][] doubleArray0 = gaussNewtonEstimator0.getCovariances((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unable to compute covariances: singular problem
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-35);
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      double double0 = gaussNewtonEstimator0.getChiSquare((EstimationProblem) simpleEstimationProblem0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      double double0 = levenbergMarquardtEstimator0.getRMS((EstimationProblem) simpleEstimationProblem0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 10;
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      
      gaussNewtonEstimator0.rows = int0;
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      
      // Undeclared exception!
      try {
        gaussNewtonEstimator0.updateResidualsAndCost();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      
      int int0 = levenbergMarquardtEstimator0.getCostEvaluations();
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, int0);
      
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      try {
        gaussNewtonEstimator0.updateResidualsAndCost();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of evaluations exceeded (0)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 3266;
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      gaussNewtonEstimator0.initializeEstimate(simpleEstimationProblem0);
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      
      gaussNewtonEstimator0.rows = int0;
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      
      // Undeclared exception!
      try {
        double[][] doubleArray0 = gaussNewtonEstimator0.getCovariances((EstimationProblem) simpleEstimationProblem0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 3266;
      GaussNewtonEstimator gaussNewtonEstimator0 = new GaussNewtonEstimator(int0, int0, int0);
      assertNotNull(gaussNewtonEstimator0);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      
      int int1 = gaussNewtonEstimator0.getJacobianEvaluations();
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, gaussNewtonEstimator0.getCostEvaluations());
      assertEquals(0, gaussNewtonEstimator0.getJacobianEvaluations());
      assertEquals(0, int1);
  }

  @Test
  public void test8()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      assertNotNull(levenbergMarquardtEstimator0);
      assertEquals(0, levenbergMarquardtEstimator0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtEstimator0.getCostEvaluations());
      
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      assertNotNull(simpleEstimationProblem0);
      
      levenbergMarquardtEstimator0.estimate((EstimationProblem) simpleEstimationProblem0);
      assertEquals(1, levenbergMarquardtEstimator0.getCostEvaluations());
      assertEquals(1, levenbergMarquardtEstimator0.getJacobianEvaluations());
  }
}