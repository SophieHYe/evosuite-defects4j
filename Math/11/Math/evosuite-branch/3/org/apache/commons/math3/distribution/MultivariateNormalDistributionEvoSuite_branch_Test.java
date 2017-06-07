/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:18:15 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultivariateNormalDistributionEvoSuite_branch_Test extends MultivariateNormalDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      long long0 = (-155L);
      long long1 = 1504L;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) long1;
      double[][] doubleArray1 = new double[2][7];
      double[] doubleArray2 = new double[2];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[1], doubleArray1);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double[] doubleArray3 = multivariateNormalDistribution0.sample();
      assertArrayEquals(new double[] {(-154.9999999694782), 1482.3066636325127}, doubleArray3, 0.01);
      assertNotSame(doubleArray3, doubleArray0);
      assertNotSame(doubleArray3, doubleArray2);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertFalse(doubleArray3.equals((Object)doubleArray0));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertNotNull(doubleArray3);
  }

  @Test
  public void test1()  throws Throwable  {
      long long0 = (-155L);
      long long1 = 1504L;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) long1;
      double[][] doubleArray1 = new double[2][7];
      double[] doubleArray2 = new double[2];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[1], doubleArray1);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double[] doubleArray3 = multivariateNormalDistribution0.getStandardDeviations();
      assertArrayEquals(new double[] {0.0, 38.781438859330635}, doubleArray3, 0.01);
      assertNotSame(doubleArray3, doubleArray0);
      assertNotSame(doubleArray3, doubleArray2);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertFalse(doubleArray3.equals((Object)doubleArray0));
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertNotNull(doubleArray3);
  }

  @Test
  public void test2()  throws Throwable  {
      long long0 = (-155L);
      long long1 = 1504L;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) long1;
      double[][] doubleArray1 = new double[2][7];
      double[] doubleArray2 = new double[2];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[1], doubleArray1);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double[] doubleArray3 = new double[20];
      assertNotSame(doubleArray3, doubleArray2);
      assertNotSame(doubleArray3, doubleArray0);
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertFalse(doubleArray3.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray3;
      assertNotNull(doubleArray1[0]);
      
      try {
        double double0 = multivariateNormalDistribution0.density(doubleArray1[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 20 != 2
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-4452.2898);
      doubleArray0[0] = double0;
      int[] intArray0 = new int[3];
      Well19937c well19937c0 = new Well19937c(intArray0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertNotNull(well19937c0);
      
      double[][] doubleArray1 = new double[1][3];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well19937c0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4,452.29 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -4,452.29 at index 0
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][2];
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[3], doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 6
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[][] doubleArray1 = new double[5][2];
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 1
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      long long0 = (-155L);
      long long1 = 1504L;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) long1;
      double[][] doubleArray1 = new double[2][7];
      double[] doubleArray2 = new double[2];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[1], doubleArray1);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      double double0 = multivariateNormalDistribution0.density(doubleArray2);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
      assertNotSame(doubleArray2, doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertFalse(doubleArray2.equals((Object)doubleArray0));
  }

  @Test
  public void test7()  throws Throwable  {
      long long0 = (-155L);
      long long1 = 1504L;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) long0;
      doubleArray0[1] = (double) long1;
      double[][] doubleArray1 = new double[2][7];
      double[] doubleArray2 = new double[2];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray1[0] = doubleArray2;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray1[1], doubleArray1);
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertNotNull(multivariateNormalDistribution0);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)multivariateNormalDistribution0.getCovariances();
      assertEquals(2, multivariateNormalDistribution0.getDimension());
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
  }
}