/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:48:11 GMT 2014
 */

package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.UnboundedSolutionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SimplexSolverEvoSuite_branch_Test extends SimplexSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 40.083156264384876;
      int int0 = 7;
      SimplexSolver simplexSolver0 = new SimplexSolver(double0, int0);
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNotNull(simplexSolver0);
      
      double[] doubleArray0 = new double[17];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[6]);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(linearObjectiveFunction0);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      boolean boolean0 = false;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(pointValuePair0);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 3772.0125485516737;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertNotNull(simplexSolver0);
      
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = double0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, double0);
      assertEquals(3772.0125485516737, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 3772.0125485516737, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(linearObjectiveFunction0);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      boolean boolean0 = true;
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
      }
  }
}