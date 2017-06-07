/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:06:58 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class WeightEvoSuite_branch_Test extends WeightEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (1x7) matrix
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DiagonalMatrix diagonalMatrix0 = new DiagonalMatrix(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(diagonalMatrix0);
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(2, diagonalMatrix0.getRowDimension());
      assertEquals(2, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      
      Weight weight0 = new Weight((RealMatrix) diagonalMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(2, diagonalMatrix0.getRowDimension());
      assertEquals(2, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(diagonalMatrix0);
      assertEquals(4, diagonalMatrix0.getColumnDimension());
      assertEquals(4, diagonalMatrix0.getRowDimension());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertEquals(true, diagonalMatrix0.isSquare());
  }
}