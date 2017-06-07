/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:27:34 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.GammaDistribution;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class AbstractContinuousDistributionEvoSuite_branch_Test extends AbstractContinuousDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 19.880021759173;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(double0, double0);
      assertNotNull(gammaDistributionImpl0);
      assertEquals(19.880021759173, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(19.880021759173, gammaDistributionImpl0.getBeta(), 0.01D);
      
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0, (GammaDistribution) gammaDistributionImpl0);
      assertNotNull(chiSquaredDistributionImpl0);
      assertEquals(9.9400108795865, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(19.880021759173, gammaDistributionImpl0.getBeta(), 0.01D);
      assertEquals(19.880021759173, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      
      double double1 = 1.0E-6;
      double double2 = chiSquaredDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(19.880021759173, double2, 0.01D);
      assertEquals(9.9400108795865, gammaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals(19.880021759173, gammaDistributionImpl0.getBeta(), 0.01D);
      assertEquals(19.880021759173, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
  }

  @Test
  public void test1()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      assertNotNull(normalDistributionImpl0);
      assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01D);
      assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01D);
      
      double double0 = 1625.0082095085945;
      // Undeclared exception!
      try {
        double double1 = normalDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,625.008 out of [0, 1] range
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-1029.197519);
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(double0, double0);
      assertNotNull(betaDistributionImpl0);
      assertEquals((-1029.197519), betaDistributionImpl0.getAlpha(), 0.01D);
      assertEquals((-1029.197519), betaDistributionImpl0.getBeta(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = betaDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,029.198 out of [0, 1] range
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1.0E-5;
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(double0);
      assertNotNull(chiSquaredDistributionImpl0);
      assertEquals(1.0E-5, chiSquaredDistributionImpl0.getDegreesOfFreedom(), 0.01D);
      
      try {
        double double1 = chiSquaredDistributionImpl0.inverseCumulativeProbability(double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=0, final a value=0, final b value=0, f(a)=0.996, f(b)=1
         //
      }
  }
}