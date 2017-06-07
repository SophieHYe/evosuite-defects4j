/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:27:46 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class HypergeometricDistributionEvoSuite_branch_Test extends HypergeometricDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      int int0 = 5306;
      int int1 = 671;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well512a0, int0, int1, int1);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(671, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(671, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(84.85506973237844, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(671, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      
      int int2 = 157;
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(int2);
      assertEquals(8.206139143039052E-17, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(671, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(671, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(84.85506973237844, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(671, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
  }

  @Test
  public void test01()  throws Throwable  {
      int int0 = 1038;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int0);
      assertNotNull(hypergeometricDistribution0);
      assertEquals(1038, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1038.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1038, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(1038, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1038, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1038, hypergeometricDistribution0.getNumberOfSuccesses());
      
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(int0);
      assertEquals(1.0, double0, 0.01D);
      assertEquals(1038, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1038.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1038, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(1038, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1038, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1038, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test
  public void test02()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      int[] intArray0 = new int[6];
      int int0 = 5306;
      intArray0[0] = int0;
      int int1 = 671;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well512a0, int0, int1, int1);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(84.85506973237844, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(671, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(671, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(671, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(intArray0[0]);
      assertArrayEquals(new int[] {5306, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(84.85506973237844, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(671, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(671, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(671, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
  }

  @Test
  public void test03()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      assertNotNull(well44497b0);
      
      int int0 = 4460;
      int int1 = 0;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497b0, int0, int0, int1);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(4460, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(0, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(4460, hypergeometricDistribution0.getPopulationSize());
      
      double double0 = hypergeometricDistribution0.probability(int0);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(4460, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(0, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(4460, hypergeometricDistribution0.getPopulationSize());
  }

  @Test
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = 3067;
      intArray0[4] = int0;
      int int1 = (-3473);
      Well44497a well44497a0 = new Well44497a(intArray0);
      assertNotNull(well44497a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 3067, 0, 0, 0}, intArray0);
      
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, intArray0[4], intArray0[4], intArray0[3]);
      assertNotNull(hypergeometricDistribution0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 3067, 0, 0, 0}, intArray0);
      assertEquals(0, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3067, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3067, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      
      double double0 = hypergeometricDistribution0.probability(int1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 3067, 0, 0, 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertEquals(0, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(3067, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(3067, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = 1971;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      
      int int1 = 4210;
      int int2 = 44;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497a0, int1, int0, int2);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertEquals(20.599524940617577, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1971, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(4210, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(44, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(44, hypergeometricDistribution0.getSupportUpperBound());
      
      int int3 = hypergeometricDistribution0.sample();
      assertEquals(22, int3);
      assertFalse(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int3);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int3 == int2);
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int3);
      assertFalse(int1 == int0);
      assertEquals(20.599524940617577, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1971, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(4210, hypergeometricDistribution0.getPopulationSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(44, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(44, hypergeometricDistribution0.getSupportUpperBound());
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 1;
      int int1 = 1115;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(int1, int1, int1);
      assertNotNull(hypergeometricDistribution0);
      assertFalse(int1 == int0);
      assertEquals(1115, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1115.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1115, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1115, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1115, hypergeometricDistribution0.getSampleSize());
      assertEquals(1115, hypergeometricDistribution0.getNumberOfSuccesses());
      
      double double0 = hypergeometricDistribution0.cumulativeProbability(int0, int0);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1115, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(1115.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1115, hypergeometricDistribution0.getPopulationSize());
      assertEquals(1115, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(1115, hypergeometricDistribution0.getSampleSize());
      assertEquals(1115, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test
  public void test07()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      int int0 = 5306;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well512a0, int0, int0, int0);
      assertNotNull(hypergeometricDistribution0);
      assertEquals(5306, hypergeometricDistribution0.getSampleSize());
      assertEquals(5306, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(5306.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(5306, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(5306, hypergeometricDistribution0.getSupportUpperBound());
      
      double double0 = hypergeometricDistribution0.cumulativeProbability(int0, int0);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(5306, hypergeometricDistribution0.getSampleSize());
      assertEquals(5306, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(5306, hypergeometricDistribution0.getPopulationSize());
      assertEquals(5306.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(5306, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(5306, hypergeometricDistribution0.getSupportUpperBound());
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = 4460;
      int int1 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister(int1);
      assertNotNull(mersenneTwister0);
      assertFalse(int1 == int0);
      
      int int2 = 8;
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, int2, int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (4,460) must be less than or equal to population size (8)
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = 1;
      int int1 = 1143;
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int0, int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,143) must be less than or equal to population size (1)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 1971;
      int int1 = (-1);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int0, int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 3655;
      int int1 = (-1640531527);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(int0, int1, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-1,640,531,527)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 4460;
      MersenneTwister mersenneTwister0 = new MersenneTwister(int0);
      assertNotNull(mersenneTwister0);
      
      int int1 = (-414);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, int1, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-414)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b();
      assertNotNull(well44497b0);
      
      int int0 = 4460;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497b0, int0, int0, int0);
      assertNotNull(hypergeometricDistribution0);
      assertEquals(4460, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(4460, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(4460.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(4460, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(4460, hypergeometricDistribution0.getPopulationSize());
      assertEquals(4460, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(4460, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(4460, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(4460.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(4460, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(4460, hypergeometricDistribution0.getPopulationSize());
      assertEquals(4460, hypergeometricDistribution0.getSampleSize());
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
  }

  @Test
  public void test14()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      int[] intArray0 = new int[6];
      byte byte0 = (byte)37;
      intArray0[2] = (int) byte0;
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well512a0, (int) byte0, (int) byte0, (int) byte0);
      assertNotNull(hypergeometricDistribution0);
      assertEquals(37, hypergeometricDistribution0.getPopulationSize());
      assertEquals(37, hypergeometricDistribution0.getSampleSize());
      assertEquals(37, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(37.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(37, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(37, hypergeometricDistribution0.getNumberOfSuccesses());
      
      int[] intArray1 = hypergeometricDistribution0.sample(intArray0[2]);
      assertNotNull(intArray1);
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
      assertArrayEquals(new int[] {37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37}, intArray1);
      assertArrayEquals(new int[] {0, 0, 37, 0, 0, 0}, intArray0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertEquals(37, hypergeometricDistribution0.getPopulationSize());
      assertEquals(37, hypergeometricDistribution0.getSampleSize());
      assertEquals(37, hypergeometricDistribution0.getSupportUpperBound());
      assertEquals(37.0, hypergeometricDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, hypergeometricDistribution0.isSupportConnected());
      assertEquals(37, hypergeometricDistribution0.getSupportLowerBound());
      assertEquals(37, hypergeometricDistribution0.getNumberOfSuccesses());
  }
}